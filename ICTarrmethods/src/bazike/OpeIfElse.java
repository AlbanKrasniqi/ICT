package bazike;

import java.util.Scanner;

public class OpeIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Shkruaj numrin e pare: ");
		int a = scan.nextInt();
		System.out.print("Shkruaj numrin e dyte: ");
		int b = scan.nextInt();
		
		System.out.print("Shkruaj ndonjerin nga opertatoret: +,-,*,/,%: ");
		char op = scan.next().charAt(0);
		if(op=='+') {
			System.out.println(a+"+"+b+"="+(a+b));
		}else if(op=='-') {
			System.out.println(a+"-"+b+"="+(a-b));
		}else if(op=='*') {
			System.out.println(a+"*"+b+"="+(a*b));
		}else if(op=='/') {
			if(b==0) {
				System.out.println("Pjestim me zero");
			}
			System.out.println(a+"/"+b+"="+(a/b));
		}else if(op=='%') {
			System.out.println(a+"%"+b+"="+(a%b));
		}else {
			System.out.print("Operatori i dhene eshte gabim");
		}
		

	}

}
