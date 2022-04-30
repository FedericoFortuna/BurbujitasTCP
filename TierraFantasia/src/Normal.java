
public class Normal extends Raza {

	public Normal(int posicion) {
		super(100, 72, posicion, 10, 50, "Manos");
	}

	@Override
	public void atacar(Raza objetivo) {
		objetivo.recibirAtaque(this.daño);
	}

	@Override
	public void recibirAtaque(int daño) {
		this.salud -= daño;
		if (this.salud < 0) {
			this.salud = 0;
		}
	}

	@Override
	public void descansar() {
		if (this.salud < 10) {
			this.salud += 1;
		}
	}

	@Override
	public void moverse(int valor) {
		if (valor >= 10)
			this.posicion += 10;
		else if (valor <= -10)
			this.posicion -= 10;
		else
			this.posicion += valor;
	}
}
