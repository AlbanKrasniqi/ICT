package Katrori;

public class Drejtkendeshii {
	private double a;
	private double b;
	public Drejtkendeshii() {
		
	}
	public Drejtkendeshii(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double perimetriD() {
		return 2*(a+b);
	}public double syprinaD() {
		return a*b;
	}
	public boolean isSquare() {
		if (a==b) {
			return true;
		}return false;
			
		
	}

	
	
	
	
	

}
