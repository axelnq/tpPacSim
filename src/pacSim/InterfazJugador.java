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

			try {
				leido = sc.nextLine();
				opc = Integer.parseInt(leido);
			} catch (Exception e) {
				opc = 10;
			}

			switch (opc) {

			case 1:

				Casillero casillero = unJuego.casilleroAMover("Arriba");
				mover(casillero);

				unJuego.mostrarTablero();

				break;
			case 2:
				Casillero casillero2 = unJuego.casilleroAMover("Abajo");
				mover(casillero2);

				unJuego.mostrarTablero();

				break;
			case 3:
				Casillero casillero3 = unJuego.casilleroAMover("Izquierda");
				mover(casillero3);
				unJuego.mostrarTablero();

				break;

			case 4:
				Casillero casillero4 = unJuego.casilleroAMover("Derecha");
				mover(casillero4);

				unJuego.mostrarTablero();
				break;
			default:
				System.out.println("Debes introducir SOLAMENTE n�meros del 1 al 4");
				break;
			}
		} while (opc != -1 && !unJuego.termino());

	}

	private static void mover(Casillero casillero) {
		if (casillero.puedoMover()) {
			casillero.recibirMovimiento(unPac);
			tablero.setPosJugador(casillero.getPosicionX(), casillero.getPosicionY());
			tablero.setLibre(unPac.getPosicionX(), unPac.getPosicionY());

			unPac.moverPac(casillero.getPosicionX(), casillero.getPosicionY());

		} else {
			casillero.recibirMovimiento(unPac);
		}
	}

}
