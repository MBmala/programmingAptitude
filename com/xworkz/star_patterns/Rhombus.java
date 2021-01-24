package com.xworkz.star_patterns;

public class Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		int mid = num / 2;

		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (i + j == mid || j - i == mid || i - j == mid || i + j == num + mid)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
		
		/*
		 * for (int i = 0; i <= num; i++) { for (int j = 0; j <= num; j++) { if ((j <= i
		 * ||i + j >= num)&&(j >= i || i + j <= num)) System.out.print("*"); else
		 * System.out.print(" "); } System.out.println(); }
		 */


	}

}
