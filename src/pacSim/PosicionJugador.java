package pacSim;

public class PosicionJugador extends Casillero {

	private String tipo = "Jugador";

	public PosicionJugador() {

	}

	@Override
	public String getTipo() {

		return tipo;
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
