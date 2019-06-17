package pacSim;

public class Tablero {

	private Casillero[][] tableroPac;
	private static Tablero unTablero;
	private int alto;
	private int ancho;

	public Casillero casilleroAMover;

	private Tablero(int alto, int ancho, int[][] mapaMinas, int[][] mapaProvisiones, int[][] mapaPared, int xEntrada,
			int yEntrada, int xSalida, int ySalida) {

		this.tableroPac = new Casillero[alto][ancho];
		this.alto = alto;
		this.ancho = ancho;
		llenarTablero(mapaMinas, mapaProvisiones, mapaPared, xEntrada, yEntrada, xSalida, ySalida);

	}

	public static Tablero getTablero(int alto, int ancho, int[][] mapaMinas, int[][] mapaProvisiones, int[][] mapaPared,
			int xEntrada, int yEntrada, int xSalida, int ySalida) {

		if (unTablero == null) {
			unTablero = new Tablero(alto, ancho, mapaMinas, mapaProvisiones, mapaPared, xEntrada, yEntrada, xSalida,
					ySalida);
		}

		return unTablero;
	}

	private void llenarTablero(int[][] mapaMinas, int[][] mapaProvisiones, int[][] mapaPared, int xEntrada,
			int yEntrada, int xSalida, int ySalida) {

		llenarLibres();

		llenarMinas(mapaMinas);
		llenarProvisiones(mapaProvisiones);
		llenarParedes(mapaPared);

		setearEntradaYSalida(xEntrada, yEntrada, xSalida, ySalida);
	}

	private void setearEntradaYSalida(int xEntrada, int yEntrada, int xSalida, int ySalida) {

		this.tableroPac[xEntrada][yEntrada] = new Entrada();
		this.tableroPac[xSalida][ySalida] = new Salida();

	}

	public Casillero getCasillero(int xPosicion, int yPosicion) {

		for (int i = 0; i < tableroPac.length; i++) {

			for (int j = 0; j < tableroPac[i].length; j++) {

				if (i == xPosicion && j == yPosicion) {

					casilleroAMover = tableroPac[i][j];
				}

			}

		}

		return casilleroAMover;
	}

	private void llenarLibres() {

		for (int i = 0; i < this.tableroPac.length; i++) {
			for (int j = 0; j < this.tableroPac[i].length; j++) {

				tableroPac[i][j] = new Normal();

			}
		}

	}

	private void llenarMinas(int[][] mapaMinas) {

		for (int i = 0; i < mapaMinas.length; i++) {
			for (int j = 0; j < mapaMinas[i].length; j++) {
				if (mapaMinas[i][j] == 1) {
					
					
					tableroPac[i][j].agregarElemento("Mina");
					
					
					

				
				}
			}
		}

	}

	private void llenarProvisiones(int[][] mapaProvisiones) {

		for (int i = 0; i < mapaProvisiones.length; i++) {
			for (int j = 0; j < mapaProvisiones[i].length; j++) {
				if (mapaProvisiones[i][j] == 1) {

					tableroPac[i][j].agregarElemento("Escudo");
				}
			}
		}

	}

	private void llenarParedes(int[][] mapaPared) {

		for (int i = 0; i < mapaPared.length; i++) {
			for (int j = 0; j < mapaPared[i].length; j++) {
				if (mapaPared[i][j] == 1) {

					Pared pared = new Pared();
					pared.agregarElemento("Mina");

					this.tableroPac[i][j] = pared;
				}
			}
		}

	}

	public Casillero obtenerCasillero(int x, int y) {
		return tableroPac[x][y];
	}

	public void setPosJugador(int x, int y) {
		tableroPac[x][y] = new PosicionJugador();
	}
	
	public void setLibre(int x, int y) {
		tableroPac[x][y] = new Normal();
	}

	/*
	 * private Casillero obtenerMina() { return Casillero.MINA; }
	 * 
	 * private Casillero obtenerPared() { return Casillero.PARED; }
	 * 
	 * private Casillero obtenerProvision() { return Casillero.PROVISION; }
	 * 
	 * private Casillero casilleroLibre() { return Casillero.LIBRE; }
	 * 
	 * public void setPosJugador(int x, int y){ tableroPac[x][y] =
	 * Casillero.JUGADOR; }
	 * 
	 * public void destruirMina(int x, int y){ this.tableroPac[x][y] =
	 * Casillero.LIBRE; } public void destruirProvision(int x, int y){
	 * this.tableroPac[x][y] = Casillero.LIBRE; }
	 */
	public int getAlto() {
		return this.alto;
	}

	public int getAncho() {
		return this.ancho;
	}

	public Casillero[][] obtenerTablero() {
		return this.tableroPac;
	}

	public static void resetTablero() {
		unTablero = null;
	}

}
