package com.xworkz.star_patterns;

public class Square {
	public static void main(String args[]) {
		int num = 4;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (i == 0 || i == num || j == 0 || j == num) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
