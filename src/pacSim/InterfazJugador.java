package pacSim;

import java.util.Scanner;

public class InterfazJugador {

	public static Juego unJuego;

	public static Pac unPac;
	public static Tablero tablero;

	public static void main(String[] args) {

		unJuego = new Juego();
		Scanner sc = new Scanner(System.in);

		unPac = unJuego.unPac;

		tablero = unJuego.tablero;

		unJuego.mostrarTablero();

		menuMovimientos(sc);

	}

	public static void menuMovimientos(Scanner sc) {

		String leido;
		int opc = 0;

		do {
			System.out.println("1. Arriba");
			System.out.println("2. Abajo");
			System.out.println("3. Izquierda");
			System.out.println("4. Derecha");
			System.out.print("Opcion ->");

			leido = sc.nextLine();

			while (!leido.equals("1") && !leido.equals("2") && !leido.equals("3") && !leido.equals("4")) {
				System.out.println("Opcion invalida");
				System.out.println("1. Arriba");
				System.out.println("2. Abajo");
				System.out.println("3. Izquierda");
				System.out.println("4. Derecha");
				System.out.print("Opcion ->");
				leido = sc.nextLine();
			}

			opc = Integer.parseInt(leido);

			switch (opc) {

			case 1:

				Casillero casillero = unJuego.casilleroAMover("Arriba");
				if (casillero.puedoMover()) {
					casillero.recibirMovimiento(unPac);
					tablero.setPosJugador(unJuego.posicionX, unJuego.posicionY);
					tablero.setLibre(unPac.getPosicionX(), unPac.getPosicionY());

					unPac.moverPac(unJuego.posicionX, unJuego.posicionY);

				} else {
					casillero.recibirMovimiento(unPac);
				}

				unJuego.mostrarTablero();

				break;
			case 2:
				Casillero casillero2 = unJuego.casilleroAMover("Abajo");
				if (casillero2.puedoMover()) {

					casillero2.recibirMovimiento(unPac);
					tablero.setPosJugador(unJuego.posicionX, unJuego.posicionY);
					tablero.setLibre(unPac.getPosicionX(), unPac.getPosicionY());

					unPac.moverPac(unJuego.posicionX, unJuego.posicionY);

				} else {
					casillero2.recibirMovimiento(unPac);
				}

				unJuego.mostrarTablero();

				break;
			case 3:
				Casillero casillero3 = unJuego.casilleroAMover("Izquierda");
				if (casillero3.puedoMover()) {

					casillero3.recibirMovimiento(unPac);
					tablero.setPosJugador(unJuego.posicionX, unJuego.posicionY);
					tablero.setLibre(unPac.getPosicionX(), unPac.getPosicionY());

					unPac.moverPac(unJuego.posicionX, unJuego.posicionY);

				} else {
					casillero3.recibirMovimiento(unPac);
				}
				unJuego.mostrarTablero();

				break;

			case 4:
				Casillero casillero4 = unJuego.casilleroAMover("Derecha");
				if (casillero4.puedoMover()) {

					casillero4.recibirMovimiento(unPac);
					tablero.setPosJugador(unJuego.posicionX, unJuego.posicionY);
					tablero.setLibre(unPac.getPosicionX(), unPac.getPosicionY());

					unPac.moverPac(unJuego.posicionX, unJuego.posicionY);

				} else {
					casillero4.recibirMovimiento(unPac);
				}

				unJuego.mostrarTablero();
				break;
			}
		} while (opc != -1 && !unJuego.termino());

	}

}
