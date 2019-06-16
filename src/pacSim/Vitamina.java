package pacSim;

public class Vitamina extends Provision{
	
	public int vitamina = 1;
	private String tipo = "Vitamina";
	
	public Vitamina() {
		
	}

	@Override
	public void efecto(Pac unPac) {
		System.out.println("Encontraste una vitamina , tu vida actual es " + unPac.getVida());
		unPac.aumentarVida(vitamina);
		System.out.println("Sumando la vitamina tenes " + unPac.getVida());
		
	}
	@Override
	public void mostrar() {
		
		System.out.println("Es una vitamina");
	}
	@Override
	public String getTipo() {
		
		return tipo;
	}

	

}
