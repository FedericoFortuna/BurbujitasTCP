import static org.junit.Assert.*;

import org.junit.Test;

public class RazaTigronTest {
	@Test
	public void testDañoLejano() {
		Tigron uno = new Tigron(2);
		Tigron dos = new Tigron(6);
		uno.atacar(dos);
		assertEquals(42, dos.getSalud());
	}

	@Test
	public void testMoverse() {
		Tigron uno = new Tigron(2);
		Tigron dos = new Tigron(6);
		dos.moverse(-5);
		uno.atacar(dos);
		assertEquals(35, dos.getSalud());
	}

	@Test
	public void testDañoSuperior() {
		Tigron uno = new Tigron(2);
		Tigron dos = new Tigron(3);
		uno.atacar(dos);
		uno.atacar(dos);
		uno.atacar(dos);
		uno.atacar(dos);
		uno.atacar(dos);
		dos.atacar(uno);
		assertEquals(7, dos.getSalud());
	}

	@Test
	public void testDescansar() {
		Tigron uno = new Tigron(2);
		Tigron dos = new Tigron(3);
		uno.atacar(dos);
		uno.atacar(dos);
		uno.atacar(dos);
		uno.atacar(dos);
		dos.descansar();
		assertEquals(35, dos.getSalud());
	}

}
