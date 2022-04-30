
public class Franquina extends Raza {
	static final int NO_RANGO_SUP = -1;

	public Franquina(int posicion) {
		super(160, 111, posicion, 20, NO_RANGO_SUP, "Rifle");
	}

	@Override
	public void recibirAtaque(int daño) {
		if (this.salud > 0) {
			this.salud -= daño;
			this.salud *= 1.1;
		}
	}

	@Override
	public void descansar() {//
		if (this.salud > 0) {
			this.rangoInf = 2;
		}
	}

	@Override
	public void moverse(int valor) {
		if (this.salud > 0) {
			if (valor < 0)
				this.movMax *= -1;
			this.posicion += (Math.abs(this.movMax) > Math.abs(valor)) ? valor : this.movMax;
		}
	}

	@Override
	public void atacar(Raza objetivo) {
		if (this.salud > 0) {
			int distancia = Math.abs(objetivo.posicion - this.posicion);
			if (distancia >= this.rangoInf) {
				objetivo.recibirAtaque(this.daño - (distancia - (int)this.rangoInf));
			}
		}
	}
}