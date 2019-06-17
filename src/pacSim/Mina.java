package pacSim;

public class Mina {
	
	
	private static Mina mina;

	private int danio = 1;
	
	private String tipo = "Mina";
	
	

	public Mina() {
		
	}
	public static Mina getMina() {
		if (mina == null) {
			mina = new Mina();
		}
		return mina;
	}

	public void efecto(Pac unPac) {

		if (unPac.getEscudo() > 0) {
			System.out.println("Encontrate una mina, tu escudo actual es :  " + unPac.getEscudo());

			unPac.reducirEscudo(danio);

			System.out.println("Por el daño te queda : " + unPac.getEscudo());

		} else {
			unPac.reducirVida(danio);
			System.out.println("Encontrate una mina y no tenias escudo, perdiste una vida, te quedan: " + unPac.getVida() + " vidas.");

		}

	}

	public void mostrar() {

		System.out.println("Es una mina");

	}
	
	public String getTipo() {
		
		return tipo;
	}
	
	
	

	

}
