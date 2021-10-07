package bazike;

import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Shenoni nje fjale:");
		String fjala = scan.nextLine();
		int start = 0;
		int end = fjala.length() - 1;
		boolean eshtePalindrom = true;
		while (start < end) {
			if (fjala.charAt(start) != fjala.charAt(end)) {
				eshtePalindrom = false;
				break;
			}
			start++;
			end--;
		}
		System.out.println(fjala + " është palindrome: " + eshtePalindrom);
	}
}
