package pacSim;

import java.util.ArrayList;

public abstract class Casillero {

	public Casillero() {

	}
	public abstract String getTipo();

	public abstract void recibirMovimiento(Pac unPac);

	public abstract boolean puedoMover();

}
