import static org.junit.Assert.*;

import org.junit.Test;

import entity.ElementoDePista;
import entity.Vehiculo;
import entity.VehiculoJugador;
import enums.Color;

public class VehiculoTest {

	@Test
	public void AvanzarUnBloque() {
		Vehiculo auto = new VehiculoJugador(0, Color.AZUL);
		auto.avanzar();
		assertEquals((int) 1.0, (int) auto.getY());

	}

	@Test
	public void AvanzarDosBloque() {
		Vehiculo auto = new VehiculoJugador(0, Color.AZUL);
		auto.avanzar();
		auto.avanzar();
		assertEquals((int) 2.0, (int) auto.getY());

	}

	@Test
	public void AvanzarConVelocidadMaximaBloque() {
		Vehiculo auto = new VehiculoJugador(0, Color.AZUL);
		auto.avanzar();
		auto.avanzar();
		auto.avanzar();
		auto.avanzar();
		auto.avanzar();
		auto.avanzar();
		auto.avanzar();
		auto.avanzar();
		assertEquals((int) 20.0, (int) auto.getY());

	}

	@Test
	public void Frenar() {
		Vehiculo auto = new VehiculoJugador(0, Color.NEGRO);
		auto.avanzar();
		auto.frenar();
		assertEquals((int) 0, (int) auto.getVelocidad());
	}

	@Test
	public void FrenarNoBajaDe0KmH() {
		Vehiculo auto = new VehiculoJugador(0, Color.NEGRO);
		auto.frenar();
		auto.frenar(); // el calculo daria -100
		assertEquals((int) 0, (int) auto.getVelocidad());
	}

	@Test
	public void NoSuperaLaVelMax() {
		Vehiculo auto = new VehiculoJugador(0, Color.NEGRO);
		auto.avanzar();
		auto.avanzar();
		auto.avanzar();
		auto.avanzar();
		auto.avanzar();
		auto.avanzar();
		auto.avanzar();
		auto.avanzar();
		auto.avanzar();
		auto.avanzar();
		assertEquals((int) 400, (int) auto.getVelocidad());
	}

	@Test
	public void CambiarAModoMejorado() {
		Vehiculo auto = new VehiculoJugador(0, Color.NEGRO);
		auto.cambiarModo();
		assertEquals("ModoVehiculoJugadorMejorado", ((VehiculoJugador) auto).getModo().getClass().getSimpleName()); // revisar
	}

	@Test
	public void CambiarAModoNormal() {
		Vehiculo auto = new VehiculoJugador(0, Color.NEGRO);
		auto.cambiarModo(); // De normal a mejorado
		auto.cambiarModo(); // De mejorado a normal
		assertEquals("ModoVehiculoJugadorNormal", ((VehiculoJugador) auto).getModo().getClass().getSimpleName()); // revisar
	}

	@Test
	public void Chocar() {
		Vehiculo auto = new VehiculoJugador(0, Color.NEGRO);
		auto.avanzar();
		auto.avanzar();
		auto.chocar(); // retrocede 1
		assertEquals((int) 1, (int) auto.getY());
	}

	@Test
	public void ChocarTresVecesYMorir() {
		Vehiculo auto = new VehiculoJugador(0, Color.NEGRO);
		auto.avanzar();
		auto.avanzar();
		auto.avanzar();
		auto.avanzar();
		auto.explotar(); // retrocede 1
		auto.explotar(); // retrocede 1
		auto.explotar(); // retrocede 1
		assertFalse(auto.isVivo());
	}

}
