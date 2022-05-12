package entity;

public class ModoVehiculoJugadorNormal extends ModoVehiculoJugador {
	
	@Override
	public int avanzar() {
		return 50; // aumento velocidad de a 50
	}

	@Override
	public int frenar() {
		return -50;
	}
	
	@Override 
	public int chocar() {
		return 1; //lo hago retroceder un lugar
	}

//	@Override
//	public void moverseAIzquierda(Vehiculo vehiculo) {
//		// TODO Auto-generated method stub
//	}
//
//	@Override
//	public void moverseADerecha(Vehiculo vehiculo) {
//		// TODO Auto-generated method stub	
//	}
	
	@Override
	public ModoVehiculoJugador cambiarModo() {
		return new ModoVehiculoJugadorMejorado();
	}
}
