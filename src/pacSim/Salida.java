package pacSim;

public class Salida extends Casillero {

	private static final String VALOR = " S ";

	@Override
	public void recibirMovimiento(Pac unPac) {
		
		
		
		System.out.println("Encontraste la salida , GANASTE !!!");

	}

	@Override
	public boolean puedoMover() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public String mostrarCasillero() {
		return VALOR;
	}

	@Override
	public void agregarElemento(String elemento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean esSalida() {
		// TODO Auto-generated method stub
		return true;
	}

}
