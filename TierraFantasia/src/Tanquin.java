public class Tanquin extends Raza {
	private boolean descanso;
	private boolean loAtacaron;

	public Tanquin(int pos) {
		super(300, 82, pos, 0, 4, "Martillo de guerra");
	}

	@Override
	public void atacar(Raza objetivo) {
		if (this.salud > 0) {
			if (this.descanso == true && this.loAtacaron == true) {
				objetivo.recibirAtaque(this.daño);
				this.descanso = false;
				this.loAtacaron = false;
			}
		}
	}

	@Override
	public void recibirAtaque(int daño) {
		if (this.salud > 0) {
			this.salud -= daño * 2;
			if (this.salud < 0)
				this.salud = 0;
			this.loAtacaron = true;
		}
	}

	@Override
	public void descansar() {
		if (this.salud > 0) {
			this.salud += 100;
			this.saludIni *= 1.11;
			this.descanso = true;
		}
	}

	@Override
	public void moverse(int metros) {
		if (this.salud > 0) {
			if (Math.abs(metros) <= this.movMax)
				this.posicion += metros / 2;
		}
	}

}