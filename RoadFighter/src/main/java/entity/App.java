package entity;

import enums.Color;

public class App {
	
	public static void main(String[] args) {
		Pista p = new Pista();
		ElementoDePista j = new VehiculoJugador(1,Color.AZUL);
		ElementoDePista bot1 = new VehiculoAutonomo(20,Color.ROJO);
		ElementoDePista bot2 = new VehiculoAutonomo(50,Color.ROJO);
		ElementoDePista bot3 = new VehiculoAutonomo(70,Color.ROJO);
		ElementoDePista obs = new Obstaculo(90);
		ElementoDePista pwUp = new PowerUp(30);
		
	}
	
}
