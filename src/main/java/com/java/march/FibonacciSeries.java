package com.java.march;

import java.util.Scanner;

public class FibonacciSeries {

	public void fiboSeries(int num) {
		int a = 0, b = 1, c = 0;
		for (int i = 0; i <= num; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}
	}

	public int fiboUsingRecursion(int num) {

		if (num == 0)
			return 0;
		if (num == 1)
			return 1;
		else
			return fiboUsingRecursion(num - 1) + fiboUsingRecursion(num - 2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter yout number to get fibonacci series");
		int num = scanner.nextInt();
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		// fibonacciSeries.fiboSeries(num);
		for (int i = 0; i < num; i++) {
			int result = fibonacciSeries.fiboUsingRecursion(i);
			System.out.print(result + " ");
		}
	}
}
