package ClasessObjects;

import java.util.Random;

public class BankCardAccount {
	Random random = new Random();
	private String name;
    private double balance;
    private int id;

    //constructors -> menyrat se si mund te krijojme objekte te klases
    public BankCardAccount() {
        //konstruktori default i mbush me vlera default
        //primitivet i mbsuh me vlera 0, boolean false, objektet = null
    }

    public BankCardAccount(String name, double balance,int id) {
        this.name = name;
        this.balance = balance;
        this.id = id;
    }

    //vetit get dhe set
    public void setName(String name) {
         this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
    
    public void setId(int id) {
    	this.id = id;
    	
    	
  }

   public int getId() {
	   
	 
	return id;
   }


    //metoda depozit
    public void deposit(double amount) {
        if(amount<=0) {
            System.out.println("Vlera te lejuara jane vlerat pozitive deri me 10000");
            return;
        }
        else if(amount>10_000) {
            System.out.println("Nuk mundesh me depozitu pa deshmi mbi 10000 EUR");
            return;
        }
        balance += amount;
    }
	

}
