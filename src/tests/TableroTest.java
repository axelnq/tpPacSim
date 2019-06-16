package tests;

import pacSim.*;
// Probando git
public class TableroTest {

	public static void main(String[] args) {
		
	
		Juego unJuego = new Juego();
		
		Pac unPac = unJuego.unPac;
		Tablero tablero = unJuego.tablero;
		
		tablero.setPosJugador(unPac.getPosicionX(), unPac.getPosicionY());
		
		unJuego.mostrarTablero(); // 
		
		Casillero casillero = unJuego.casilleroAMover("Izquierda");
		
		casillero.recibirMovimiento(unPac);
		
		tablero.setPosJugador(unJuego.posicionX, unJuego.posicionY);
		tablero.setLibre(unPac.getPosicionX(), unPac.getPosicionY());
		
		unPac.moverPac(unJuego.posicionX, unJuego.posicionY);
		
		
		unJuego.mostrarTablero();
		
		/// testeo de 1 movimiento 
	}
	
	

	

	

	

}
