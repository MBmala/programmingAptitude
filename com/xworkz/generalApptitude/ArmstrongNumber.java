package com.xworkz.generalApptitude;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		//ex numbers 153,1253,1634 
		System.out.println("ArmstrongNumber:"+armstrongNumber.isArmstrong(num));

	}

	int power(int x, long y) {
		if (y == 0)
			return 1;
		if (y % 2 == 0)
			return power(x, y / 2) * power(x, y / 2);
		return x * power(x, y / 2) * power(x, y / 2);
	}

	int order(int x) {
		int n = 0;
		while (x != 0) {
			n++;
			x = x / 10;
		}
		return n;
	}

	boolean isArmstrong(int x) {
		int n = order(x);
		int temp = x, sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum + power(r, n);
			temp = temp / 10;
		}

		return (sum == x);
	}

}
