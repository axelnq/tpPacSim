package pacSim;

public class Escudo  extends Provision {

	private int escudoDeFuerza = 1;
	
	private String tipo = "Escudo";

	public Escudo() {

	}

	
	public void efecto(Pac unPac) {
		
		System.out.println("Encontrate un Escudo, tu escudo actual es :  " + unPac.getEscudo());

		unPac.aumentarEscudo(escudoDeFuerza);
		 
		System.out.println("Sumado te queda : " + unPac.getEscudo());

	}

	public void mostrar() {

		System.out.println("Es una escudo");
	}
	
	@Override
	public String getTipo() {
		
		return tipo;
	}

}
