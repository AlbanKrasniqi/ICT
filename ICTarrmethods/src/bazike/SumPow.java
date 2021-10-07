package bazike;

import java.util.Scanner;

public class SumPow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Shtyp nje numer dhe bej mbledhjen e ati numri deri ne fund: ");
		int n = scan.nextInt();
		int shuma = 0;
		for(int i =0; i<=n; i++) {
			shuma+=i;
		//	System.out.println(shuma);
			
		}
		System.out.println("Rezultati: "+shuma);
		System.out.print("Shtyp nje numer trego per plotpjestueshmeri:");
		int nn = scan.nextInt();
		for(int i=1; i<=nn;i++) {
			if(nn%i==0) {
				System.out.print(i+" i plotpjestueshem me "+nn);
			}else {
				System.out.print(i+" jo i plotpjestueshem me "+nn);
			}
			System.out.println("");

			
		}		
		

	}

	
	}
