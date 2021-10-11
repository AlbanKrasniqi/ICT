package EnumsAndObjects;

public class RethiOb {
	private double r ;
	public RethiOb(double r) {
		this.r = r;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double perimetriRr() {
		return 2*Math.PI*r;
	}
	public double syprinaRr() {
		return Math.PI*(r*r);
	}
	
}
