package pacSim;

public class Entrada extends Casillero {
	
	public String tipo = "Entrada";
	

	@Override
	public void recibirMovimiento(Pac unPac) {
		System.out.println("Es la entrada ");
		
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
