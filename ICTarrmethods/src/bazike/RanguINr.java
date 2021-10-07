package bazike;

import java.util.Scanner;

public class RanguINr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Shkruaj nje numer nga -10000 deri ne 10000: ");
		int a = scan.nextInt();
		if(a>=-10000 && a<=10000) {
			System.out.println("numri eshte ne rangun e dhene” ");
		}else {
			System.out.println("numri nuk eshte ne rangun e dhene” ");
		}
		

	}

}
