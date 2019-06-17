package pacSim;

public class Juego {

	public Tablero tablero;
	public Pac unPac;
	public Casillero casillero;
	public boolean posicionValida = true;

	public boolean gano = false;
//	public int posicionX = 0;
//	public int posicionY = 0;

	public Juego() {

		int mapaMinas[][] = { { 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 0 },
				{ 1, 1, 1, 1, 0 } };

		int mapaPared[][] = { { 0, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1 },
				{ 0, 0, 0, 0, 0 } };

		int mapaProvision[][] = { { 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
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

	}

	public Casillero casilleroAMover(String movimiento) {

		if (movimiento.equalsIgnoreCase("Arriba")
				&& comprobarCasillero(unPac.getPosicionX() - 1, unPac.getPosicionY())) {

			casillero = tablero.getCasillero(unPac.getPosicionX() - 1, unPac.getPosicionY());
			casillero.setPosicionX(unPac.getPosicionX() - 1);
			casillero.setPosicionY(unPac.getPosicionY());

		}
		if (movimiento.equalsIgnoreCase("Abajo")
				&& comprobarCasillero(unPac.getPosicionX() + 1, unPac.getPosicionY())) {

			casillero = tablero.getCasillero(unPac.getPosicionX() + 1, unPac.getPosicionY());
			casillero.setPosicionX(unPac.getPosicionX() + 1);
			casillero.setPosicionY(unPac.getPosicionY());

		}

		if (movimiento.equalsIgnoreCase("Izquierda")
				&& comprobarCasillero(unPac.getPosicionX(), unPac.getPosicionY() - 1)) {

			casillero = tablero.getCasillero(unPac.getPosicionX(), unPac.getPosicionY() - 1);
			casillero.setPosicionX(unPac.getPosicionX());
			casillero.setPosicionY(unPac.getPosicionY() - 1);
		}

		if (movimiento.equalsIgnoreCase("Derecha")
				&& comprobarCasillero(unPac.getPosicionX(), unPac.getPosicionY() + 1)) {

			casillero = tablero.getCasillero(unPac.getPosicionX(), unPac.getPosicionY() + 1);
			casillero.setPosicionX(unPac.getPosicionX());
			casillero.setPosicionY(unPac.getPosicionY() + 1);

		}
		return casillero;
	}
//
//	public void actualizarPosicionJugador() {
//		
//		this.tablero.setPosJugador(posicionX, posicionY); // al casillero al que nos vamos a mover lo ponemos en PosicionJugador
//		this.tablero.setLibre(unPac.getPosicionX(), unPac.getPosicionY()); // dejamos libre el casillero donde estaba el pac
//		unPac.moverPac(posicionX, posicionY);
//	}

	public boolean termino() {
		if (unPac.getVida() == 0 || gano == true) {
			return true;
		} else {

			return false;
		}
	}

	public void gano() {
		gano = true;

	}

	public void mostrarPuntuacion() {
		if (gano == true) {
			System.out.println("GANASTE! Tu puntuacion es de: " + unPac.getVida() + " vidas.");
		} else {
			System.out.println("HAS PERDIDO! Te quedaste sin vidas.");
		}
	}

	public void mostrarTablero() {

		Casillero[][] tableroCompleto = tablero.obtenerTablero();

		for (int i = 0; i < tableroCompleto.length; i++) {

			System.out.print("|");

			for (int j = 0; j < tableroCompleto[i].length; j++) {
				System.out.print(tableroCompleto[i][j].mostrarCasillero());
			}

			System.out.print("|");
			System.out.println();
		}

	}

	public boolean comprobarCasillero(int posicionX, int posicionY) {

		try {

			posicionValida = true;

			if (posicionX < 0 || posicionY < 0 || posicionX > tablero.getAncho() - 1
					|| posicionY > tablero.getAlto() - 1) {

				posicionValida = false;
				System.out.println("No se realizo movimiento, llegaste al limite del tablero");

			}

		} catch (Exception e) {

		}
		return posicionValida;

	}

	/*
	 * public void mostrarTablero() { String fila = " "; for (int i = 0; i <
	 * this.tablero.obtenerTablero().length; i++) { fila = " "; fila += " | ";
	 * 
	 * for (int j = 0; j < this.tablero.obtenerTablero()[i].length; j++) {
	 * 
	 * if (this.tablero.getCasillero(i,
	 * j).mostrarCasillero().equalsIgnoreCase("Jugador")) { fila += "  J  "; }
	 * 
	 * if (this.tablero.getCasillero(i,
	 * j).mostrarCasillero().equalsIgnoreCase("Entrada")) { fila += "  E  "; } if
	 * (this.tablero.getCasillero(i, j).mostrarCasillero().equalsIgnoreCase("Mina"))
	 * { fila += "  M  "; }
	 * 
	 * if (this.tablero.getCasillero(i,
	 * j).mostrarCasillero().equalsIgnoreCase("Pared")) { fila += "  X  "; } if
	 * (this.tablero.getCasillero(i,
	 * j).mostrarCasillero().equalsIgnoreCase("Salida")) { fila += "  S  "; } if
	 * (this.tablero.getCasillero(i,
	 * j).mostrarCasillero().equalsIgnoreCase("Provision")) { fila += "  P  "; } if
	 * (this.tablero.getCasillero(i,
	 * j).mostrarCasillero().equalsIgnoreCase("Vacio")) { fila += "  L  "; }
	 * 
	 * }
	 * 
	 * fila += " | "; System.out.println(fila); } }
	 */

}
