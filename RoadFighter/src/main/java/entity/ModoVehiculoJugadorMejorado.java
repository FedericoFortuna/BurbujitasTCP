package entity;

public class ModoVehiculoJugadorMejorado extends ModoVehiculoJugador {

	//Estos metodos hacen que el power up solo lo haga acelerar mas rapido
	@Override
	public int avanzar() {
		return 100;
	}
	
	@Override
	public int frenar() {
		return -50; //lo ponemos igual q el otro o -100 para q frene mas de golpe?
	}
	
	//Este metodo lo hace invulnerable
	@Override
	public int chocar() {
		return 0;
	}
	
	@Override
	public ModoVehiculoJugador cambiarModo() {
		return new ModoVehiculoJugadorNormal();
	}

}
