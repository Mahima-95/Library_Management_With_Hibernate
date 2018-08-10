package com.java;

import java.util.Scanner;

public class FibonacciSeriesUsingRecursive {

	public int findFibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		else
			return findFibonacci(n - 1) + findFibonacci(n - 2);
	}

	public static void main(String[] args) {
		FibonacciSeriesUsingRecursive fibonacciSeriesUsingRecursive = new FibonacciSeriesUsingRecursive();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter fibonacci Term :");
		int num = scanner.nextInt();
		for (int i = 0; i < num; i++) {
			int result = fibonacciSeriesUsingRecursive.findFibonacci(i);
			System.out.print(" " + result);
		}
	}
}