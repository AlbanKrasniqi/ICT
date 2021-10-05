import java.util.Scanner;

public class Vargu2DManual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numrat[][] = new int[3][3];

		for (int i = 0; i < numrat.length; i++) {
			for(int j = 0; j<numrat[i].length; j++) {
			System.out.print("Shtyp numrin: ");
			numrat[i][j] = scan.nextInt();
		}
			}

		for (int i = 0; i < numrat.length; i++) {
			for(int j = 0; j<numrat.length; j++) {
			System.out.print(numrat[i][j]);
		}
			System.out.println();
			}
	}
}
