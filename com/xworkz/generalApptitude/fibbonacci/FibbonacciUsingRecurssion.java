package com.xworkz.generalApptitude.fibbonacci;

public class FibbonacciUsingRecurssion {

	public static void main(String args[]) {
		int n = 9;
		FibbonacciUsingRecurssion fibbonacci = new FibbonacciUsingRecurssion();
		System.out.println(fibbonacci.fib(n));
	}

	int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}
}
