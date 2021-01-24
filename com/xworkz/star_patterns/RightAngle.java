package com.xworkz.star_patterns;

public class RightAngle {

	public static void main(String[] args) {
		int num=5;
	
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (j <= i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("OR");
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (j==0||i==num||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		
		
	}
}
