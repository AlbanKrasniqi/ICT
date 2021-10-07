package bazike;

import java.util.Scanner;

public class Yjet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Sa 5 deshironi figuren: ");
		int b = scan.nextInt();
		
		for(int i =1; i<=b;i++ ) {
			for(int j = 1; j<=i;j++) {
			System.out.print(j+i);
			}
			System.out.println(); 

		}

	}

}
