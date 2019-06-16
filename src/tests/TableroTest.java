package tests;

import pacSim.*;
// Probando git
public class TableroTest {

	public static Tablero tablero;
	public static  Pac unPac;
	public static Casillero casillero;
	
	public static int posicionX = 0;
	public static int posicionY = 0;
	
	public static void main(String[] args) {
		
		int mapaMinas[][] = { { 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0 } };

		int mapaPared[][] = { { 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1},
				{ 0, 0, 0, 0, 0 } };

		int mapaProvision[][] = { { 1, 0,0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0 } };

		int xEntrada = 4;
		int yEntrada = 4;

		int xSalida = 1;
		int ySalida = 4;

		int alto = 5;
		int ancho = 5;
		
		tablero = Tablero.getTablero(alto, ancho, mapaMinas, mapaProvision, mapaPared, xEntrada, yEntrada, xSalida,
				ySalida);
		unPac = Pac.getPac(xEntrada, yEntrada);
		
		
		
		
		tablero.setPosJugador(unPac.getPosicionX(), unPac.getPosicionY());
		
		mostrarTablero();
		
		casillero = casilleroAMover("Izquierda");
		
		casillero.recibirMovimiento(unPac);
		
		tablero.setPosJugador(posicionX, posicionY);
		tablero.setLibre(unPac.getPosicionX(), unPac.getPosicionY());
		
		unPac.moverPac(posicionX, posicionY);
		
		
		mostrarTablero();
		
		/// testeo de 1 movimiento 
	}
	
	
	public static void mostrarTablero() {
		String fila = " ";
		for (int i = 0; i < tablero.obtenerTablero().length; i++) {
			fila = " ";
			fila += " | ";

			for (int j = 0; j < tablero.obtenerTablero()[i].length; j++) {

				if (tablero.getCasillero(i, j).getTipo().equalsIgnoreCase("Jugador")) {
					fila += "  J  ";
				}

				if (tablero.getCasillero(i, j).getTipo().equalsIgnoreCase("Entrada")) {
					fila += "  E  ";
				}
				if (tablero.getCasillero(i, j).getTipo().equalsIgnoreCase("Mina")) {
					fila += "  M  ";
				}

				if (tablero.getCasillero(i, j).getTipo().equalsIgnoreCase("Pared")) {
					fila += "  X  ";
				}
				if (tablero.getCasillero(i, j).getTipo().equalsIgnoreCase("Salida")) {
					fila += "  S  ";
				}
				if (tablero.getCasillero(i, j).getTipo().equalsIgnoreCase("Escudo") || tablero.getCasillero(i, j).getTipo().equalsIgnoreCase("Vitamina") ) {
					fila += "  P  ";
				}
				if (tablero.getCasillero(i, j).getTipo().equalsIgnoreCase("Vacio")) {
					fila += "  L  ";
				}

			}

			fila += " | ";
			System.out.println(fila);
		}
	}
	
	
	public static Casillero casilleroAMover(String movimiento) {

		if (movimiento.equalsIgnoreCase("Arriba")) {

			casillero = tablero.getCasillero(unPac.getPosicionX() - 1, unPac.getPosicionY());

			posicionX = unPac.getPosicionX() - 1;
			posicionY = unPac.getPosicionY();

		}
		if (movimiento.equalsIgnoreCase("Abajo")) {

			casillero = tablero.getCasillero(unPac.getPosicionX() + 1, unPac.getPosicionY());
			posicionX = unPac.getPosicionX() + 1;
			posicionY = unPac.getPosicionY();

		}

		if (movimiento.equalsIgnoreCase("Izquierda")) {

			casillero = tablero.getCasillero(unPac.getPosicionX(), unPac.getPosicionY() - 1);
			posicionX = unPac.getPosicionX();
			posicionY = unPac.getPosicionY() - 1;

		}

		if (movimiento.equalsIgnoreCase("Derecha")) {

			casillero = tablero.getCasillero(unPac.getPosicionX(), unPac.getPosicionY() + 1);
			posicionX = unPac.getPosicionX();
			posicionY = unPac.getPosicionY() + 1;

		}
		return casillero;
	}
	

}
