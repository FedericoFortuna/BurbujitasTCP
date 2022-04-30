
public class Detonadora extends Raza {

	private int ataqueEspecial;
	
	public Detonadora(int posicion) {

		super(93, 72, posicion, 3, 50, "Magia");
		this.ataqueEspecial = 0;
	}

	@Override
	public void atacar(Raza victima) {
		if (this.salud > 0) {
			if (Math.abs(this.posicion - victima.getPos()) > this.rangoInf
					&& Math.abs(this.posicion - victima.getPos()) < this.rangoSup) {
				if (this.ataqueEspecial > 0) {
					victima.recibirAtaque(this.daño * 3);
					this.ataqueEspecial--;
				} else {
					this.salud += (this.saludIni * 3) / 100;
					victima.recibirAtaque(this.daño);
				}

			}
		}

	}

	@Override
	public void descansar() {
		if (this.salud > 0) {
			this.ataqueEspecial = 2;
		}
	}

	@Override
	public void recibirAtaque(int ataque) {
		if (this.salud > 0) {
			this.salud -= ataque;
			if (this.salud < 0) {
				this.salud = 0;
			}
		}
	}

	@Override
	public void moverse(int valor) {
		if (this.salud > 0) {
			if (valor >= this.movMax) {
				this.posicion += this.movMax;
			} else if (valor <= -this.movMax) {
				this.posicion -= this.movMax;
			} else if (valor > 0) {
				this.posicion += valor;
			} else if (valor < 0) {
				this.posicion -= valor;
			}
		}
	}

}
