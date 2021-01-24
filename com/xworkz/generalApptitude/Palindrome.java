package com.xworkz.generalApptitude;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string");
		String str = scanner.nextLine();

		Palindrome palindrome = new Palindrome();
		boolean statement = palindrome.isPalindrome(str);
		System.out.println("Palindrome: "+statement);
	}

	boolean isPalindrome(String str) {

		int i = 0, j = str.length() - 1;
		while (i < j) {

			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
