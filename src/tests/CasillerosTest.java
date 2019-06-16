package tests;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pacSim.Normal;
import pacSim.Pac;

class CasillerosTest {

	private Pac unPac;
	private Normal n1;
	private Normal n2;
	private Normal n3;
	private Normal n4;

	@BeforeEach
	public void prepararTests() {
		unPac = Pac.getPac(5, 6);
		n1 = new Normal();
		n2 = new Normal();
		n3 = new Normal();
		n4 = new Normal();
	}

	@Test
	public void aplicarEfectosProvisionesYMinasTest() {

		n1.agregarElemento("Escudo");
		n2.agregarElemento("Vitamina");
		n3.agregarElemento("Compuesta");
		n4.agregarElemento("Mina");

		n3.provision.add(n1.provision);
		n3.provision.add(n2.provision);
		n3.agregarElemento("Mina");

		n1.recibirMovimiento(unPac);
		// System.out.println("normal 1");

		n2.recibirMovimiento(unPac);

		// System.out.println("normal 2");
		n3.recibirMovimiento(unPac);

		// System.out.println("normal 3");

		n4.recibirMovimiento(unPac);
		// System.out.println("normal 4");

		Assert.assertEquals(0, unPac.getEscudo());
		Assert.assertEquals(3, unPac.getVida());
	}

	@Test
	public void liberarCasilleroTest() {

		n1.agregarElemento("Escudo");
		n2.agregarElemento("Vitamina");
		n3.agregarElemento("Compuesta");
		n4.agregarElemento("Mina");
		n1.agregarElemento("Mina");

		n4.agregarElemento("Escudo");

		n4.recibirMovimiento(unPac); // libero un casillero con mina y escudo

		System.out.println("n1 : " + n1.mostrarCasillero());
		System.out.println("n2 : " + n2.mostrarCasillero());
		System.out.println("n3 : " + n3.mostrarCasillero());
		System.out.println("n4 : " + n4.mostrarCasillero());

		n2.recibirMovimiento(unPac); // era de tipo vitamina y al aplicar el efecto se vacia

		System.out.println("n2 : " + n2.mostrarCasillero());

		Assert.assertEquals("   ", n1.mostrarCasillero());
		Assert.assertEquals("   ", n2.mostrarCasillero());
		Assert.assertEquals("   ", n4.mostrarCasillero());

	}

	@Test
	public void tableroYCasilleroTest() {

	}

}
