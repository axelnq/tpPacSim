package pacSim;

public class PosicionJugador extends Casillero {

	private static final String VALOR = " J ";

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

	@Override
	public void agregarElemento(String elemento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean esSalida() {
		// TODO Auto-generated method stub
		return false;
	}

}
