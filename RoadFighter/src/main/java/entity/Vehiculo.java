package entity;

import enums.Color;

public abstract class Vehiculo extends ElementoDePista {

	protected Integer velocidad = 0;
	protected Color color;
	protected Integer vidas;
	protected boolean vivo = true;

	public Vehiculo(double y, Color c) {
		super(y);
		color = c;
	}

	public Integer getVelocidad() {
		return velocidad;
	}

	public Color getColor() {
		return color;
	}

	public Integer getVidas() {
		return vidas;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void avanzar() {

	}

	public void chocar() {

	}

	public void frenar() {

	}
	
	public void cambiarModo() {
		
	}

	// se comporta igual tanto para jugador como para bot
	public void explotar() {
		this.vidas -= 1;
		if (this.vidas < 1) {
			this.vivo = false;
		}
	}
}
