package bazike;

import java.util.Scanner;

public class Perimetri {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=====================");
		System.out.println("Perimetri e katrorit: ");
		System.out.print("Jep vleren e a: ");
		double a  = scan.nextDouble();
		double PK = 4*a;
		System.out.println("Perimetri i katrorit eshte: "+PK);
		System.out.println("==============================");
		
		System.out.println("Perimetri i drejtkendeshit: ");
		System.out.print("Jep vleren e lartesis: ");
		double l = scan.nextDouble();
		System.out.print("Jep vleren e gjersise: ");
		double w = scan.nextDouble();
		double PD = 2*(w+l);
		System.out.println("Perimetri i drejtkendeshit eshte: "+PD);
		System.out.println("=========================================");
		System.out.println("Perimetri i rrethit: ");
		final double pi = Math.PI;
		System.out.print("Jep vleren e rrezes: ");
		double r = scan.nextDouble();
		double PR = 2*pi*r;
		System.out.println("Perimetri i rrethit eshte: "+PR);
		System.out.println("================================");
		System.out.println("Perimetri i trekendeshit: ");
		System.out.print("Jep vleren e base: ");
		double b = scan.nextDouble();
		System.out.print("Jep vleren e side 1: ");
		double at = scan.nextDouble();
		System.out.print("Jep vleren e side 2: ");
		double bt = scan.nextDouble();
		double PT = b + at+bt;
		System.out.println("Perimetri i trekendeshit eshte: "+PT);
		System.out.println("====================================");
		
		

	}

}
