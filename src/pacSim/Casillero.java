package pacSim;

public abstract class Casillero {

	private int posicionX = 0;
	private int posicionY = 0;
	
	public abstract String mostrarCasillero();
	
	public abstract boolean esSalida();
	
	public abstract  void agregarElemento(String elemento);

	public abstract void recibirMovimiento(Pac unPac);

	public abstract boolean puedoMover();

	public int getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

}
