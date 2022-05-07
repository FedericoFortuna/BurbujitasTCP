package entity;

public abstract class ElementoDePista extends Pista{
	private double y;
	

	public ElementoDePista(double y) {
		this.y = y;
	}



	public void setY(double y) {
		this.y = y;
	}



	public double getY() {
		return y;
	}
	
	
	
}
