package bazike;

import java.util.Scanner;

public class ConsCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Kalkulatori i thjeshte: ");
		System.out.print("Jep vleren e nr te pare: ");
		int a  = scan.nextInt();
		System.out.print("Jep vleren e nr te dyte: ");
		int b = scan.nextInt();
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"%"+b+"="+(a%b));

		

	}

}
