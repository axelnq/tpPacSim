package tests;

import pacSim.*;

public class CasilleroTest {

	public static Pac unPac = Pac.getPac(5, 6);

	public static void main(String[] args) {

		// arrayDeCasillerosTest();

		// casillerosYEfectosTest();

		// efectosEnArrayDoble();

		//arrayDobleLLenarDeMinasYEfectoTest();

		//arrayDobleLLenarDeCompuestaYEfectoTest();
		
		//arrayDobleLLenarDeMinaYProvisionCompuestaYEfectoTest();
		
		//arrayDobleLLenarDeMinaYProvisionSimpleYEfectoTest();
		
		//arrayDobleLLenarDeParedYEfectoTest();
		
		//arrayDobleLLenarDePosicionJugadorYEfectoTest();
		
		//arrayDobleLLenarDeEntradaYEfectoTest();
		
		//arrayDobleLLenarDeSalidaYEfectoTest();
		
		//arrayDobleLLenarDeEscudoYEfectoTest();
		
		//arrayDobleLLenarDeVitaminaYEfectoTest();

	}

	private static void arrayDobleLLenarDeMinasYEfectoTest() {
		Casillero[][] casilleros1 = new Casillero[3][3];

		for (int i = 0; i < casilleros1.length; i++) {

			for (int j = 0; j < casilleros1.length; j++) {

				Normal n4 = new Normal();
				n4.agregarElemento("Mina");
				
				

				casilleros1[i][j] = n4;

				casilleros1[i][j].recibirMovimiento(unPac);
			}
		}
	}
	private static void arrayDobleLLenarDePosicionJugadorYEfectoTest() {
		Casillero[][] casilleros1 = new Casillero[3][3];

		for (int i = 0; i < casilleros1.length; i++) {

			for (int j = 0; j < casilleros1.length; j++) {

				PosicionJugador n4 = new PosicionJugador();
				
			
				casilleros1[i][j] = n4;

				casilleros1[i][j].recibirMovimiento(unPac);
			}
		}
	}
	
	private static void arrayDobleLLenarDeParedYEfectoTest() {
		Casillero[][] casilleros1 = new Casillero[3][3];

		for (int i = 0; i < casilleros1.length; i++) {

			for (int j = 0; j < casilleros1.length; j++) {

				Pared n4 = new Pared();
				
				

				casilleros1[i][j] = n4;

				casilleros1[i][j].recibirMovimiento(unPac);
			}
		}
	
	}
	private static void arrayDobleLLenarDeEntradaYEfectoTest() {
		Casillero[][] casilleros1 = new Casillero[3][3];

		for (int i = 0; i < casilleros1.length; i++) {

			for (int j = 0; j < casilleros1.length; j++) {

				Entrada n4 = new Entrada();
				
				

				casilleros1[i][j] = n4;

				casilleros1[i][j].recibirMovimiento(unPac);
			}
		}
	
	}
	
	private static void arrayDobleLLenarDeSalidaYEfectoTest() {
		Casillero[][] casilleros1 = new Casillero[3][3];

		for (int i = 0; i < casilleros1.length; i++) {

			for (int j = 0; j < casilleros1.length; j++) {

				Salida n4 = new Salida();
				
				

				casilleros1[i][j] = n4;

				casilleros1[i][j].recibirMovimiento(unPac);
			}
		}
	
	}
	
	private static void arrayDobleLLenarDeEscudoYEfectoTest() {
		Casillero[][] casilleros1 = new Casillero[3][3];

		for (int i = 0; i < casilleros1.length; i++) {

			for (int j = 0; j < casilleros1.length; j++) {

				Normal n4 = new Normal();
				n4.agregarElemento("Escudo");
				

				casilleros1[i][j] = n4;

				casilleros1[i][j].recibirMovimiento(unPac);
			}
		}
	
	}
	
	private static void arrayDobleLLenarDeVitaminaYEfectoTest() {
		Casillero[][] casilleros1 = new Casillero[3][3];

		for (int i = 0; i < casilleros1.length; i++) {

			for (int j = 0; j < casilleros1.length; j++) {

				Normal n4 = new Normal();
				n4.agregarElemento("Vitamina");
				

				casilleros1[i][j] = n4;

				casilleros1[i][j].recibirMovimiento(unPac);
			}
		}
	
	}
	
	
	
	

	private static void efectosEnArrayDoble() {

		Normal n1 = new Normal();
		PosicionJugador n2 = new PosicionJugador();
		Normal n3 = new Normal();
		Normal n4 = new Normal();
		n4.agregarElemento("Mina");
		Pared n5 = new Pared();
		Normal n6 = new Normal();
		n6.agregarElemento("Escudo");
		Pared n7 = new Pared();
		Normal n8 = new Normal();
		Pared n9 = new Pared();

		Casillero[][] casilleros = { { n1, n2, n3 }, { n4, n5, n6 }, { n7, n8, n9 } };

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.println("casillero" + i + " " + j);

				casilleros[i][j].recibirMovimiento(unPac);

				System.out.println();
			}
		}
	}

	private static void casillerosYEfectosTest() {

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

		n1.recibirMovimiento(unPac);
		System.out.println("normal 1");

		n2.recibirMovimiento(unPac);

		System.out.println("normal 2");
		n3.recibirMovimiento(unPac);

		System.out.println("normal 3");

		n4.recibirMovimiento(unPac);
		System.out.println("normal 4");
	}

	private static void arrayDeCasillerosTest() {
		Casillero[] casilleros = new Casillero[3];

		Normal n1 = new Normal();

		n1.agregarElemento("Mina");

		casilleros[0] = n1;
		casilleros[1] = new Normal();
		casilleros[2] = new PosicionJugador();

		for (int i = 0; i < casilleros.length; i++) {
			casilleros[i].recibirMovimiento(unPac);
			casilleros[i] = new PosicionJugador();

		}
		System.out.println("ahora son posicion de jugador");

		casilleros[0] = new PosicionJugador();
		casilleros[1] = new PosicionJugador();
		casilleros[2] = new PosicionJugador();

		for (int i = 0; i < casilleros.length; i++) {

			casilleros[i].recibirMovimiento(unPac);

		}
	}
	
	
	private static void arrayDobleLLenarDeCompuestaYEfectoTest() {
		Casillero[][] casilleros1 = new Casillero[3][3];

		for (int i = 0; i < casilleros1.length; i++) {

			for (int j = 0; j < casilleros1.length; j++) {

				Normal n4 = new Normal();
				n4.agregarElemento("Compuesta");
				n4.provision.add(new Escudo());
				n4.provision.add(new Vitamina());
		
				casilleros1[i][j] = n4;
				
				casilleros1[i][j].recibirMovimiento(unPac);
			System.out.println(casilleros1[i][j].mostrarCasillero());
			}
		}
	}
	private static void arrayDobleLLenarDeMinaYProvisionCompuestaYEfectoTest() {
		Casillero[][] casilleros1 = new Casillero[3][3];

		for (int i = 0; i < casilleros1.length; i++) {

			for (int j = 0; j < casilleros1.length; j++) {

				Normal n4 = new Normal();
				n4.agregarElemento("Mina");
				n4.agregarElemento("Compuesta");
				n4.provision.add(new Escudo());
				n4.provision.add(new Vitamina());
		
				casilleros1[i][j] = n4;
				
				casilleros1[i][j].recibirMovimiento(unPac);
			System.out.println(casilleros1[i][j].mostrarCasillero());
			}
		}
	}
	private static void arrayDobleLLenarDeMinaYProvisionSimpleYEfectoTest() {
		Casillero[][] casilleros1 = new Casillero[3][3];

		for (int i = 0; i < casilleros1.length; i++) {

			for (int j = 0; j < casilleros1.length; j++) {

				Normal n4 = new Normal();
				n4.agregarElemento("Escudo");
				n4.agregarElemento("Mina");
			
				
		
				casilleros1[i][j] = n4;
				
				casilleros1[i][j].recibirMovimiento(unPac);
			System.out.println(casilleros1[i][j].mostrarCasillero());
			}
		}
	}
	
	

}
