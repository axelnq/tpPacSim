package pacSim;

public class PosicionJugador extends Casillero {

	private static final String VALOR = " J ";

	public PosicionJugador() {

	}

	@Override
	public String mostrarCasillero() {
		return VALOR;
	}

	@Override
	public void recibirMovimiento(Pac unPac) {
		System.out.println("Posicion del jugador");

	}

	@Override
	public boolean puedoMover() {
		// TODO Auto-generated method stub
		return true;
	}

}
