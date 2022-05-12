package entity;

import enums.Color;

public class VehiculoJugador extends Vehiculo {

	private final Integer VELOCIDAD_MAX = 400;
	private Integer puntaje;
	private ModoVehiculoJugador modo = new ModoVehiculoJugadorNormal();
	
	public VehiculoJugador(double y, Color c) {
		super(y, c);
		puntaje = 0;
		vidas = 3;
	}
	
	@Override
	public void avanzar() {
		//primero asigno la nueva velocidad y luego avanzo
		
		if((this.velocidad + this.modo.avanzar())> this.VELOCIDAD_MAX) {
			this.velocidad = this.VELOCIDAD_MAX;
		}else{
			this.velocidad += this.modo.avanzar();
		}
		
		// entre 0 y 100 avanza 1, hasta 200 avanza 2, dsps avanza 3
		double avance = this.velocidad <= 100 ? 1 : this.velocidad <= 200 ? 2 : this.velocidad <= 300 ? 3 : 4;
		this.y += avance;
	}
	
	public void frenar() {
		//primero cambio la velocidad y luego avanzo
		
		this.velocidad += this.modo.frenar();
		if(this.velocidad < 0) {
			this.velocidad = 0;
		}
		// entre 0 y 100 avanza 1, hasta 200 avanza 2, dsps avanza 3
		double avance = this.velocidad <= 100 ? 1 : this.velocidad <= 200 ? 2 : this.velocidad <= 300 ? 3 : 4;
		this.y += avance;
		
	}
	
	public void cambiarModo() {
		this.modo = this.modo.cambiarModo();
	}
	
	@Override 
	public void chocar() {
		this.y -= this.modo.chocar();
	}
	

//	public void morir() {	// despues hay q delegar la llamda
//		this.vivo = false;
//	}

//	public void calcularPuntaje() {
//		this.puntaje = (int) ((int) getY() * Math.PI); //se multiplica por Pi para agregarle diversion al calculo nada mas
//	}
	

}
