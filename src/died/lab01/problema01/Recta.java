package died.lab01.problema01;

public class Recta {
	
	private float pendiente;
	private float ordOrigen;
	
	
	public Recta() {
		this.pendiente=1;
		this.ordOrigen=0;
	}
	
	public Recta(Punto p1, Punto p2) {
		
		 this.pendiente=(p2.getY()-p1.getY())/(p2.getX()-p1.getX());
		 this.ordOrigen=p1.getY()-(this.pendiente*p1.getX());
		
	}
	
	public float pendiente() {
		return this.pendiente;
	}
	
	public boolean paralelas(Recta otraRecta) {
		if(this.pendiente==otraRecta.pendiente && this.ordOrigen!=otraRecta.ordOrigen) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean equals(Object otraRecta) {
		if (otraRecta instanceof Recta) {
			Recta laRecta=(Recta) otraRecta;
			if(this.pendiente==laRecta.pendiente && this.ordOrigen==laRecta.ordOrigen) {
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
