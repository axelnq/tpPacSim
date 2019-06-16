package pacSim;

import java.util.Scanner;

public class InterfazJugador {

	public static Tablero tablero;
	public static Pac unPac;
	public static Juego unJuego;
	public static String movimiento = "Arriba";

	public static void main(String[] args) {

		unJuego = new Juego();

		unJuego.mostrarTablero();
		
		System.out.println("----------------------------------");
		
		Casillero casillero = unJuego.casilleroAMover(movimiento);
		
		System.out.println(casillero.getTipo());
		
		casillero.recibirMovimiento(unPac);
		
		
	
		
		
		

		/*if (casillero.puedoMover()) {

			casillero.recibirMovimiento(unPac);
			unJuego.actualizarPosicionJugador();

		} else {
			System.out.println("Casillero invalido");
		}
		
		unJuego.mostrarTablero();*/

	}

	
	private static void mover() { // testean

		
		

		Casillero casillero = unJuego.casilleroAMover(movimiento);

		if (casillero.puedoMover()) {

			casillero.recibirMovimiento(unPac);
			unJuego.actualizarPosicionJugador();

		} else {
			System.out.println("Casillero invalido");
		}
		
		

	}

	

}
