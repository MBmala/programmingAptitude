package com.xworkz.generalApptitude.fibbonacci;

import java.util.Scanner;

public class FibbonacciUsingForLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int count = scanner.nextInt();
		int num1 = 0, num2 = 1;
		System.out.print("Fibonacci Series of " + count + " numbers:");

		for (int i = 1; i <= count; ++i) {
			System.out.print(num1 + " ");

			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
	}
}
