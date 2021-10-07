package bazike;

import java.util.Scanner;

public class Paga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Shkruaj pagen: ");
		int paga  = scan.nextInt();
		if(paga == 0) {
			System.out.println("Pa page");
		}else if(paga>0 && paga<=80 ) {
			System.out.print("Social");
		}else if(paga>80 && paga<=120 ) {
			System.out.print(" social+ ose pensioner");
		}else if(paga>120 && paga<=180 ) {
			System.out.print(" page minimale");
		}else if(paga>180 && paga<=300 ) {
			System.out.print(" page mestare");
		}else if(paga>300 && paga<=400 ) {
			System.out.print(" page emire");
		}else if(paga>300 && paga<=400 ) {
			System.out.print(" page emire");
		}else if(paga>400 && paga<=600 ) {
			System.out.print(" page mbi mesatare emire");
		}else if(paga>600 ) {
			System.out.print(" tu chillit nKosove");
		}else {
			System.out.println("Nuk egziston");
		}
		

	}

}
