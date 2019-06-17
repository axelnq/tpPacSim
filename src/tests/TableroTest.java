package tests;

import pacSim.*;
// Probando git
public class TableroTest {

	public static void main(String[] args) {
		
	
		Juego unJuego = new Juego();
		
		Pac unPac = unJuego.unPac;
		Tablero tablero = unJuego.tablero;
		
		
		
		unJuego.mostrarTablero(); 
		
		Casillero casillero = unJuego.casilleroAMover("Izquierda");
		
		casillero.recibirMovimiento(unPac);
		
		tablero.setPosJugador(casillero.getPosicionX(), casillero.getPosicionY());
		tablero.setLibre(unPac.getPosicionX(), unPac.getPosicionY());
		
		unPac.moverPac(casillero.getPosicionX(), casillero.getPosicionY());
		
		
		unJuego.mostrarTablero();
		
		/// testeo de 1 movimiento 
	}
	
	

	

	

	

}
