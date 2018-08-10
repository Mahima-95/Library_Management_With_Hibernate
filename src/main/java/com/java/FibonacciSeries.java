package com.java;

import java.util.Scanner;

public class FibonacciSeries {
	Scanner scanner = new Scanner(System.in);

	public void findFbonacci() {
		System.out.println("Enter number to get fibonacci series");
		int num = scanner.nextInt();
		int a = 0, b = 1, c;
		System.out.print(a + " " + b);// printing 0 and 1
		for (int i = 2; i < num; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
	}

	public static void main(String[] args) {

		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.findFbonacci();
	}
}
