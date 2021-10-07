package bazike;

import java.util.Scanner;

public class Semafori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Shkruaj nje numer nga 1 deri ne 3: ");
		int numer = scan.nextInt();
		if(numer==1) {
			System.out.println("E kuqe-Stop");
		}else if(numer==2) {
			System.out.println("E verdhe-Pergaditu");
		}else if(numer==3) {
			System.out.println("E gjelbert-Vazhdo");
		}else if(numer==4) {
			System.out.println("Semafori eshte blinkuar");
		}else {
			System.out.println("Mungon rryma");
		}
		
	}

}
