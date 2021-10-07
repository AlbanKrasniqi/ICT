package bazike;

import java.util.Scanner;

public class CiftTek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Shkruaj nje numer: ");
		int n = scan.nextInt();
		//int nr = 5;
		for(int i = 1; i<=n; i++) {
			//System.out.print(i+" ");
			if(i%2==0) {
				System.out.print("Cift "+i);
			}else {
				System.out.print("Tek "+i);
			}
			System.out.println("");

		}
		

	}

}
