package entity;

import enums.Color;

public abstract class Vehiculo extends ElementoDePista {

	private static final int VELOCIDAD_MAX = 400;// max 400km/h
	private Integer velocidadMaxima;
	private Integer velocidad;
	private Color color;

	public Vehiculo(double y, Color color) {
		super(y);
		this.velocidadMaxima = VELOCIDAD_MAX;
		this.velocidad = 0;
		this.color = color;
	}

	public void avanzar() {
		this.setY(this.getY() + 1);
	}

	public Integer getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

}
