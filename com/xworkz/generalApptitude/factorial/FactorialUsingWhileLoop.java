package com.xworkz.generalApptitude.factorial;

import java.util.Scanner;

public class FactorialUsingWhileLoop {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scanner.nextInt();
		long fact = 1;
		int i = 1;
		while (i <= num) {
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial of " + num + " is: " + fact);
	}
}
