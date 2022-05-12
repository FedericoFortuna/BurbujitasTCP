package entity;

import enums.Color;

public class VehiculoAutonomo extends Vehiculo{

	public VehiculoAutonomo(double y, Color color) {
		super(y, color);
		vidas = 1;
	}

	@Override //sobreescribo xq tiene comportamientos personalizados al ser un bot, sino lo trato como Vehiculo
	public void avanzar() {
		this.velocidad = 100; //velocidad constante al avanzar
		this.y += 1; //avance posicion tmbn
	}
	
	@Override 
	public void chocar() {
		this.y -= 1;
	}
}
