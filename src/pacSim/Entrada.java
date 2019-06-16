package pacSim;

public class Entrada extends Casillero {

	private static final String VALOR = " E ";

	@Override
	public void recibirMovimiento(Pac unPac) {
		System.out.println("Es la entrada ");
	}

	@Override
	public boolean puedoMover() {
		return true;
	}

	@Override
	public String mostrarCasillero() {
		return VALOR;
	}

}
