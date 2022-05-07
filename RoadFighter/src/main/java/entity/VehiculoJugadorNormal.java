package entity;

import enums.Color;

public class VehiculoJugadorNormal extends VehiculoJugador {

	private boolean vivo;

	public VehiculoJugadorNormal(double y, Color color) {
		super(y, color);
		this.vivo = true;
	}

	public void frenar() {
		this.setY(0);
	}

	@Override
	public void avanzar() {
		super.avanzar();
		setVelocidad(getVelocidad() + 10);
		if (getVelocidad() >= getVelocidadMaxima())
			setVelocidad(getVelocidadMaxima());
	}

	public void morir() {
		this.vivo = false;
	}

}
