package com.xworkz.star_patterns;

public class Diamond {

	public static void main(String[] args) {
		int num = 4;
		int mid = num / 2;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (i + j >= mid && j - i <= mid && i + j <= num + (mid) && i - j <= mid)

					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
