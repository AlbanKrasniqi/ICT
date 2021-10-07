package bazike;

import java.util.Scanner;

public class BMIict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Shkruaj lartesin tuaj: ");
		double height = scan.nextDouble();
		System.out.print("Shkruaj peshen tuaj: ");
		double weight = scan.nextDouble();
		double BMI = (weight)/(height*height);
		
		
		 if(BMI < 18.5) {
	            System.out.println("You are underweight");
	        }else if (BMI < 25) {
	        	  System.out.println("You are normal");
	        }else if (BMI < 30) {
	        	  System.out.println("You are overweight");
	        }else {
	        	  System.out.println("You are obese");
	        }


	}

}
