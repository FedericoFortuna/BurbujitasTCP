package entity;

public abstract class ElementoDePista //extends Pista 
{
	protected double y;	//pos 

	
	public ElementoDePista(double y) {	//elementos de pista de crean antes de jugar
		this.y = y;
	}



	public void setY(double y) {
		this.y = y;
	}



	public double getY() {
		return y;
	}
	
	
	
}
