package died.lab01.problema01;

public class Punto {
	
	private float x;
	private float y;
	
	Punto(float x, float y){
		this.x=x;
		this.y=y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public boolean equals(Object otroPunto) {
		if (otroPunto instanceof Punto) {
			Punto elPunto=(Punto) otroPunto;
			if (this.x==elPunto.x && this.y==elPunto.y) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
	}

}
