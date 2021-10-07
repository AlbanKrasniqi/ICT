package bazike;

import java.util.Scanner;

public class Syprinat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("=====================");
		System.out.println("Syprina e katrorit: ");
		System.out.print("Jep vleren e a: ");
		double a  = scan.nextDouble();
		double SK = a*a;
		System.out.println("Syprina e katrorit eshte: "+SK);
		System.out.println("==============================");
		
		System.out.println("Syprina e drejtkendeshit: ");
		System.out.print("Jep vleren e lartesis: ");
		double l = scan.nextDouble();
		System.out.print("Jep vleren e gjersise: ");
		double w = scan.nextDouble();
		double SD = w*l;
		System.out.println("Syprina e drejtkendeshit eshte: "+SD);
		System.out.println("======================================");
		System.out.println("Syprina e rrethit: ");
		final double pi = Math.PI;
		System.out.print("Jep vleren e rrezes: ");
		double r = scan.nextDouble();
		double SR = pi*(r*r);
		System.out.println("Syprina e rrethit eshte: "+SR);
		System.out.println("================================");
		System.out.println("Syprina e trekendeshit: ");
		System.out.print("Jep vleren e base: ");
		double b = scan.nextDouble();
		System.out.print("Jep vleren e lartesis: ");
		double ht = scan.nextDouble();
		double ST = (b*ht)/2;
		System.out.println("Syprina e trekendeshit eshte: "+ST);
		System.out.println("===================================");
		
		
		
		

	}

}
