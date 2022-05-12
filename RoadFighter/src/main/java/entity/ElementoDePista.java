package entity;

public class ElementoDePista {
	protected double y; // pos

	public ElementoDePista(double y) { // elementos de pista de crean antes de jugar
		this.y = y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getY() {
		return y;
	}
}
