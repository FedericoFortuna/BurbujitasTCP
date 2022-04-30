
public abstract class Raza {
	protected int salud;
	protected long rangoInf;
	protected long rangoSup;
	protected int daño;
	protected int posicion;
	protected int movMax;
	protected int saludIni;
	protected String tipoAtaque;
	
	

	public Raza(int salud,  int ataque, int posicion,long rangoInf, long rantoSup, String tipoAtaque) {
		this.salud = salud;
		this.rangoInf = rangoInf;
		this.rangoSup = rantoSup;
		this.daño = ataque;
		this.posicion = posicion;
		this.movMax = 10;
		this.saludIni = salud;
		this.tipoAtaque = tipoAtaque;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public long getRangoInf() {
		return rangoInf;
	}

	public void setRangoInf(long rangoInf) {
		this.rangoInf = rangoInf;
	}

	public long getRantoSup() {
		return rangoSup;
	}

	public void setRantoSup(long rantoSup) {
		this.rangoSup = rantoSup;
	}

	public int getAtaque() {
		return daño;
	}

	public void setAtaque(int ataque) {
		this.daño = ataque;
	}

	public int getPos() {
		return posicion;
	}

	public void setPos(int pos) {
		this.posicion = pos;
	}

	public void atacar(Raza victima) {
	}

	public void descansar() {
	}

	public void recibirAtaque(int ataque) {}
	
	public void moverse(int valor) {
		
	}
}
