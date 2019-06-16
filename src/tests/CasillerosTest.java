package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pacSim.Normal;
import pacSim.Pac;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CasillerosTest {

	@Test
	public void aplicarEfectosProvisionesYMinasTest() {
		Pac unPac = new Pac(5, 6);

		Normal n1 = new Normal();
		Normal n2 = new Normal();
		Normal n3 = new Normal();
		Normal n4 = new Normal();

		n1.agregarElemento("Escudo");
		n2.agregarElemento("Vitamina");
		n3.agregarElemento("Compuesta");
		n4.agregarElemento("Mina");

		n3.provision.add(n1.provision);
		n3.provision.add(n2.provision);
		n3.agregarElemento("Mina");

		n1.recibirMovimiento(unPac);
		//System.out.println("normal 1");

		n2.recibirMovimiento(unPac);

		//System.out.println("normal 2");
		n3.recibirMovimiento(unPac);

	//	System.out.println("normal 3");

		n4.recibirMovimiento(unPac);
		//System.out.println("normal 4");

		Assert.assertEquals(0, unPac.getEscudo());
		Assert.assertEquals(3, unPac.getVida());
	}
	@Test
	public void liberarCasilleroTest() {
		
		Pac unPac = new Pac(5, 6);

		Normal n1 = new Normal();
		Normal n2 = new Normal();
		Normal n3 = new Normal();
		Normal n4 = new Normal();

		n1.agregarElemento("Escudo");
		n2.agregarElemento("Vitamina");
		n3.agregarElemento("Compuesta");
		n4.agregarElemento("Mina");
		n1.agregarElemento("Mina");
		
		n4.agregarElemento("Escudo");
		
		
		n4.recibirMovimiento(unPac); // libero un casillero con mina y escudo
		
		System.out.println("n1 : "+ n1.getTipo());
		System.out.println("n2 : "+ n2.getTipo());
		System.out.println("n3 : "+ n3.getTipo());
		System.out.println("n4 : "+ n4.getTipo());
		
		n2.recibirMovimiento(unPac); // era de tipo vitamina y al aplicar el efecto se vacia
		
		System.out.println("n2 : "+ n2.getTipo());

		Assert.assertEquals("MinaYEscudo" , n1.getTipo());
		Assert.assertEquals("Vacio", n2.getTipo());
		Assert.assertEquals("Vacio" , n4.getTipo());
		
		
		
		
		
		
	}
	@Test
	public void tableroYCasilleroTest() {
		
		
		
	}
	
	
	
	

}
