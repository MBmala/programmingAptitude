package com.xworkz.generalApptitude.primeNumber;

public class PrimeNumUsingforLoop {
	public static void main(String[] args) {
		int number = 12;
		int count=0;
		//for (int i = 2; i < number; i++)
		for (int i = 2; i < number/2; i++) {
			//number/2 it improves the performance
			if (number % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("number is prime");
		}
		else 
			System.out.println("number not prime");
	}

}
