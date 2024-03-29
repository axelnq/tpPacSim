package pacSim;

public class Pac {

	private static Pac unPac;

	private int vida;
	private int escudo;
	private int posicionX;
	private int posicionY;

	private Pac(int xEntrada, int yEntrada) {
		this.posicionX = xEntrada;
		this.posicionY = yEntrada;

		this.vida = 1;
		this.escudo = 0;

	}

	public static Pac getPac(int xEntrada, int yEntrada) {
		if (unPac == null) {
			unPac = new Pac(xEntrada, yEntrada);
		}
		return unPac;
	}

	public int getVida() {
		return vida;
	}

	public void aumentarVida(int variacion) {
		this.vida += variacion;
	}

	public void reducirVida(int variacion) {
		this.vida -= variacion;
	}

	public int getEscudo() {
		return escudo;
	}

	public void aumentarEscudo(int variacion) {
		this.escudo += variacion;
	}

	public void reducirEscudo(int variacion) {
		this.escudo -= variacion;
	}

	public int getPosicionX() {

		return posicionX;
	}

	public void moverPac(int posicionX, int posicionY) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;

	}

	public int getPosicionY() {
		return posicionY;
	}

/*	public void moverArriba() {
		this.posicionX = posicionX - 1;
	}

	public void moverAbajo() {
		this.posicionX = posicionX + 1;
	}

	public void moverDerecha() {
		this.posicionY = posicionY + 1;
	}

	public void moverIzquierda() {
		this.posicionY = posicionY - 1;
	}
*/
	public static void resetPac() {
		unPac = null;
	}

}
