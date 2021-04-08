package died.lab01.problema01;

public class Punto {
	
	float x;
	float y;
	
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
	
	public boolean equals(Punto otroPunto) {
		if (this.x==otroPunto.x && this.y==otroPunto.y) {
			return true;
		}
		else {
			return false;
		}
	}

}
