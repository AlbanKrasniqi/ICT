package bazike;

import java.util.Scanner;

public class VitiISherbimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sa eshte paga juaj: ");
		int p = scan.nextInt();
		System.out.print("Qe sa vite sherbeni ne kompanin tone: ");
		double sh = scan.nextDouble();
		
		if(sh>5) {
			double perqindja =(p/100)*5;
			double rrogare = p + perqindja;
			System.out.println("Rroga juaj ka qen: "+p+" Urime rroga juaj tashme eshte: "+rrogare);
		}else {
			System.out.println("Shpresoj te jeni te kenaqur");
		}
		

	}

}
