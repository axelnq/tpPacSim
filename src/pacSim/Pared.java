package pacSim;

public class Pared extends Casillero{

	private String tipo = "Pared";

	@Override
	public void recibirMovimiento(Pac unPac) {
		
		
		System.out.println("Hay una pared , no es posible mover");
	
		
	}

	@Override
	public boolean puedoMover() {
	
		return false;
	}
	
	@Override
	public String getTipo() {

		return tipo;

	}

}
