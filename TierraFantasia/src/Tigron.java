
public class Tigron extends Raza {
	public Tigron(int posicion) {
		super(42, 28, posicion, 0, 2, "Garras");
	}

	@Override
	public void recibirAtaque(int daño) {
		if (this.salud > 0) {
			this.salud -= daño / 4;
			if (this.salud < 0)
				this.salud = 0;
		}
	}

	@Override
	public void descansar() {
		if (this.salud > 0) {
			this.salud += this.saludIni * 0.5;
			if (this.salud > this.saludIni)
				this.salud = this.saludIni;
		}
	}

	@Override
	public void moverse(int valor) {
		if (this.salud > 0) {
			int desplazamiento = this.movMax + (this.saludIni - this.salud);
			if (valor < 0)
				desplazamiento *= -1;
			this.posicion += (Math.abs(desplazamiento) > Math.abs(valor)) ? valor : desplazamiento;
		}
	}

	@Override
	public void atacar(Raza objetivo) {
		if (this.salud > 0) {
			if (Math.abs(objetivo.posicion - this.posicion) >= this.rangoInf
					&& Math.abs(objetivo.posicion - this.posicion) < this.rangoSup) {
				if (this.salud < Math.round(this.saludIni - (this.saludIni * 35 / 100)))
					objetivo.recibirAtaque(this.daño * 5);
				objetivo.recibirAtaque(this.daño);
			}
		}
	}
}