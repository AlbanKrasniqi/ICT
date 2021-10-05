import java.util.Random;

public class VarguRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int [] numrat = new int[100];
		
		for(int  numer:numrat) {
			numrat[numer]= random.nextInt(100);
			System.out.println("Numrat random: "+numrat[numer]);
			
		}
	

	}

}
