import static org.junit.Assert.*;

import org.junit.Test;

public class RazaDetonadoraTest {

	@Test
	public void DetonadoraDescansaYAtaca() {
		Raza detonadora = new Detonadora(10);
		detonadora.descansar();
		Raza normal = new Normal(15);
		detonadora.atacar(normal);
		assertEquals(0, normal.getSalud());
	}

	@Test
	public void DetonadoraRecibeDaño() {
		Raza detonadora = new Detonadora(10);
		Raza normal = new Normal(15);
		normal.atacar(detonadora);
		assertEquals(21, detonadora.getSalud());
	}

	@Test
	public void DetonadoraAtacarSinDescansar() {
		Raza detonadora = new Detonadora(10);
		Raza normal = new Normal(15);
		detonadora.atacar(normal);
		assertEquals(28, normal.getSalud());
	}

	@Test
	public void DetonadoraSeMueveMaximo() {
		Raza detonadora = new Detonadora(10);
		detonadora.moverse(15);
		assertEquals(20, detonadora.getPos());
	}

	@Test
	public void DetonadoraSeMueve() {
		Raza detonadora = new Detonadora(10);
		detonadora.moverse(5);
		assertEquals(15, detonadora.getPos());
	}
	
	@Test
	public void DetonadoraHacerAlgoMuerto() {
		Raza normal = new Normal(15);
		Raza detonadora = new Detonadora(10);
		normal.atacar(detonadora);
		normal.atacar(detonadora);
		normal.atacar(detonadora);
		normal.atacar(detonadora);
		normal.atacar(detonadora);
		detonadora.moverse(5);
		assertEquals(10, detonadora.getPos());
	}

}
