package entity;

public abstract class ModoVehiculoJugador {
	public abstract int avanzar();
	public abstract int frenar();
	public abstract int chocar();
//	public abstract void moverseAIzquierda(Vehiculo vehiculo);
//	public abstract void moverseADerecha(Vehiculo vehiculo); X AHORA NO HACEN FALTA
	public abstract ModoVehiculoJugador cambiarModo();
	
//	private int cantVidas;
//	
//	public void daniar () {
//		this.cantVidas --;
//		if (this.cantVidas <= 0)
//			this.morir();
//	}
}
