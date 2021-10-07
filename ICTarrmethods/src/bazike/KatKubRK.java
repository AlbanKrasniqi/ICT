package bazike;

import java.util.Scanner;

public abstract class KatKubRK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Shryp nje numer: ");
		int a = scan.nextInt();
		System.out.println("Katori i nr: "+a);
		for(int i = 0; i <= a; i += 2) {
		    System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Kubi i nr: "+a);
		for(int i = 0; i <= a; i += 3) {
		    System.out.print(i+" ");
		}
		System.out.println();

		System.out.println("renja i nr: "+a);
		for(int i = 0; i <= a; i ++ ) {
			System.out.print(Math.sqrt(i) + " ");
		}

	}

}
