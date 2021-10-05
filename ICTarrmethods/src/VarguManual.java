import java.util.Scanner;

public class VarguManual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numrat[] = new int[10];
		
		for(int i = 0; i<numrat.length;i++) {
			System.out.print("Shtyp numrin "+(i+1)+": ");
			numrat [i]=  scan.nextInt();
		}

	
		for (int i = 0; i < numrat.length; i++) {
			System.out.println(numrat[i]);
		}
	}
}
