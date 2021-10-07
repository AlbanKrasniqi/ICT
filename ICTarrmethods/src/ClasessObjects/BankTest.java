package ClasessObjects;

import java.util.Random;

public class BankTest {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Random random = new Random();
		//int id = 0 ;
		//for(int i = 1; i<=16; i++) {
			//id = random.nextInt(9);
			//System.out.print(id);
		//}
		BankCardAccount account = new BankCardAccount();
        account.setName("Alban Krasniqi");
        account.setId(12569068136329L);
        account.deposit(100);
        account.deposit(200);
        account.deposit(-500);

        double balance=0;
        balance+=10;

       
       
        System.out.printf("%s ka ne llogari %.2f EUR %n",account.getName(),account.getId(), account.getBalance());


    }

	}


