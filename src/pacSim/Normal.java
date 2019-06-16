package pacSim;

import java.util.ArrayList;
import java.util.List;

public class Normal extends Casillero {

	public Mina mina;

	public boolean hayMina = false;

	public Provision provision;

	private String tipo = "Vacio";

	public Normal() {

	}

	public void agregarElemento(String elemento) {

		if (elemento.equalsIgnoreCase("Mina")) {
			this.mina = new Mina();
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
	public String getTipo() {

		if (hayMina && provision != null) {
			tipo = mina.getTipo() +"Y"+ provision.getTipo();
		} else if (hayMina && provision == null) {
			tipo = mina.getTipo();
		} else if (!hayMina && provision != null) {
			tipo = provision.getTipo();
		} else {
			tipo = "Vacio";
		}

		return tipo;

	}

}
