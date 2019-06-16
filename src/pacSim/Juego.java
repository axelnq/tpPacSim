package pacSim;

public class Juego {

	public Tablero tablero;
	public Pac unPac;
	public Casillero casillero = null;
	public int posicionX = 0;
	public int posicionY = 0;

	public Juego() {

		int mapaMinas[][] = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0 } };

		int mapaPared[][] = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1},
				{ 0, 0, 0, 0, 0 } };

		int mapaProvision[][] = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0 } };

		int xEntrada = 4;
		int yEntrada = 4;

		int xSalida = 1;
		int ySalida = 4;

		int alto = 5;
		int ancho = 5;

		this.tablero = Tablero.getTablero(alto, ancho, mapaMinas, mapaProvision, mapaPared, xEntrada, yEntrada, xSalida,
				ySalida);
		this.unPac = Pac.getPac(xEntrada, yEntrada);

		this.tablero.setPosJugador(unPac.getPosicionX(), unPac.getPosicionY());

		System.out.println(
				"Comenzo el juego! Tenes " + unPac.getVida() + " vida/s, y " + unPac.getEscudo() + " escudo/s.");

	}

	public Casillero casilleroAMover(String movimiento) {

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

	public void actualizarPosicionJugador() {
		
		this.tablero.setPosJugador(posicionX, posicionY); // al casillero al que nos vamos a mover lo ponemos en PosicionJugador
		this.tablero.setLibre(unPac.getPosicionX(), unPac.getPosicionY()); // dejamos libre el casillero donde estaba el pac
		unPac.moverPac(posicionX, posicionY);
	}

	public boolean termino() { // EL JUEGO DEJA DE FUNCIONAR SI OCURRE ALGUNA DE ESTAS DOS COSAS
		if (unPac.getVida() == 0) {
			return true;
		} else {

			return false;
		}
	}

	public void mostrarTablero() {
		
		Casillero[][] tableroCompleto = tablero.obtenerTablero();
		
		for (int i = 0; i < tableroCompleto.length; i++) {
			for (int j = 0; j < tableroCompleto[i].length; j++) {
				System.out.println(tableroCompleto[i][j]);
			}
		}
		
	}
	
	
	/*public void mostrarTablero() {
		String fila = " ";
		for (int i = 0; i < this.tablero.obtenerTablero().length; i++) {
			fila = " ";
			fila += " | ";

			for (int j = 0; j < this.tablero.obtenerTablero()[i].length; j++) {

				if (this.tablero.getCasillero(i, j).mostrarCasillero().equalsIgnoreCase("Jugador")) {
					fila += "  J  ";
				}

				if (this.tablero.getCasillero(i, j).mostrarCasillero().equalsIgnoreCase("Entrada")) {
					fila += "  E  ";
				}
				if (this.tablero.getCasillero(i, j).mostrarCasillero().equalsIgnoreCase("Mina")) {
					fila += "  M  ";
				}

				if (this.tablero.getCasillero(i, j).mostrarCasillero().equalsIgnoreCase("Pared")) {
					fila += "  X  ";
				}
				if (this.tablero.getCasillero(i, j).mostrarCasillero().equalsIgnoreCase("Salida")) {
					fila += "  S  ";
				}
				if (this.tablero.getCasillero(i, j).mostrarCasillero().equalsIgnoreCase("Provision")) {
					fila += "  P  ";
				}
				if (this.tablero.getCasillero(i, j).mostrarCasillero().equalsIgnoreCase("Vacio")) {
					fila += "  L  ";
				}

			}

			fila += " | ";
			System.out.println(fila);
		}
	}
*/
	

}
