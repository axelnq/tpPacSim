package pacSim;

public class Salida extends Casillero {

	private String tipo = "Salida";

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
	public String getTipo() {

		return tipo;

	}

}
