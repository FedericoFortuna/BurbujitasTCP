package entity;

import enums.Color;

public abstract class VehiculoJugador extends Vehiculo {

	private Integer puntaje;

	public VehiculoJugador(double y, Color color) {
		super(y, color);
		this.puntaje = 0;
	}

	public void calcularPuntaje() {
		this.puntaje = (int) ((int) getY() * Math.PI);//se multiplica por Pi para agregarle diversion al calculo nada mas
	}
}
