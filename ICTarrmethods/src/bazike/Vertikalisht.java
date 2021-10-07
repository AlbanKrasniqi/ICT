package bazike;

import java.util.Scanner;

public class Vertikalisht {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Shkuraj tekst: ");
		String f = scan.nextLine();

		System.out.println("Teksti Vertikalisht: ");
		for (int i = 0; i < f.length(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("");
			}
			System.out.println(f.charAt(i));
			//System.out.print("");
			//System.out.println(r.charAt(i));

		}
		System.out.print("Shtype nje fjali: ");
		String a = scan.nextLine();
		String r = new StringBuilder(a).reverse().toString();
		System.out.println("Reverse Vertikalisht");
		for (int i = 0; i < r.length(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("");
			}
			System.out.println(r.charAt(i));
		}
		
		

	}

}
