package pacSim;

public class Normal extends Casillero {

	public Mina mina;

	public boolean hayMina = false;

	public Provision provision;

	private String tipo = "Vacio";

	public Normal() {

	}

	public void agregarElemento(String elemento) {

		if (elemento.equalsIgnoreCase("Mina")) {
			this.mina = Mina.getMina();
			hayMina = true;
		}
		if (elemento.equalsIgnoreCase("Escudo")) {
			this.provision = new Escudo();
		}
		if (elemento.equalsIgnoreCase("Vitamina")) {
			this.provision = new Vitamina();
		}
		if (elemento.equalsIgnoreCase("Compuesta")) {
			this.provision = new ProvisionCompuesta();
		}

	}

	public void recibirMovimiento(Pac unPac) {
		
		
		if (provision != null) {
			provision.efecto(unPac);
			//provision = null;
			
		}
		
		
		if (hayMina) {
			
			mina.efecto(unPac);
			//hayMina = false;
			
	
		}
		
		
		

	}

	public boolean puedoMover() {

		return true;
	}

	@Override
	public String mostrarCasillero() {
		return "   ";
	}

	@Override
	public boolean esSalida() {
		// TODO Auto-generated method stub
		return false;
	}




}
