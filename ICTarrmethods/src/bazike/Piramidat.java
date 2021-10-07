package bazike;

import java.util.Scanner;

public class Piramidat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Sa yje deshironi figuren: ");
		int a = scan.nextInt();
		
		for(int i =a; i>=0;i-- ) {
			for(int j = i; j>=0;j--) {
			System.out.print("* ");
			}
			System.out.println();

		}
		
		System.out.print("Sa & deshironi figuren: ");
		int b = scan.nextInt();
		
		for(int i =0; i<=b;i++ ) {
			for(int j = 0; j<=i;j++) {
			System.out.print("& ");
			}
			System.out.println();

		}
	
	}

}
