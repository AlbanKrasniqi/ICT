

import java.util.Scanner;

public class RegullatPune {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Sa eshte mosha juaj: ");
		int m = scan.nextInt();
		System.out.print("Shtyp M-Mashkull, dhe F-Femer: ");
		char gj = scan.next().charAt(0);
		System.out.print("Statusi Martesor, P-I Martuar, J-Beqar/e: ");
		char s = scan.next().charAt(0);
		if(gj=='F') {
			System.out.println("Pun vetem ne zonat urbane");
		}else if(gj=='M' && (m>=20 && m<=40)) {
			System.out.println("Do tee mund te punoje kudo");
			
			
			}else if(gj=='M' && (m>40 && m<=60)) {
				System.out.println("Pun vetem ne zonat urbane");
			}
		else if(m<20&&m>60) {
				System.out.println("Nuk jeni  i afte per pune");
		}
			else {
				System.out.print("Error!");
			}

		
		

	}

}
