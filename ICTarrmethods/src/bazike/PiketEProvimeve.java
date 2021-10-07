package bazike;

import java.util.Scanner;

public class PiketEProvimeve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Provimi me pike nga 0 deri 100\n Piket qe keni arritur jane:");
		int piket = scan.nextInt();
		if(piket>=0 && piket<=49) {
			System.out.println("Nota 5");
		}else if(piket>49 && piket<=59) {
			System.out.println("Nota 6");
		}else if(piket>59 && piket<=69) {
			System.out.println("Nota 7");
		}else if(piket>69 && piket<=79) {
			System.out.println("Nota 8");
		}else if(piket>79 && piket<=89) {
			System.out.println("Nota 9");
		}else if(piket>89 && piket<=100) {
			System.out.println("Nota 10");
		}else {
			System.out.println("Piket e dhena jane gabim");
		}
		

	}

}
