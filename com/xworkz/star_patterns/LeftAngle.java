package com.xworkz.star_patterns;

public class LeftAngle {
	public static void main(String[] args) {
		int num = 4;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (i + j >= num)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (i==num||j==num||i+j==num)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
