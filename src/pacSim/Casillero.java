package pacSim;

public abstract class Casillero {

	public abstract String mostrarCasillero();
	
	public abstract  void agregarElemento(String elemento);

	public abstract void recibirMovimiento(Pac unPac);

	public abstract boolean puedoMover();

}
