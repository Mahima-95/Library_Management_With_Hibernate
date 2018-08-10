package com.java.august;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Enter your number--");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		System.out.println("fibonacci series upto" + number + "numbers:---");
		for (int i = 0; i <= number; i++) {
			System.out.println(fibo(i) + "");
		}
	}

	static int fibo(int number) {
		if (number == 0)
			return 0;
		if (number == 1)
			return 1;
		else
			return fibo(number - 1) + fibo(number - 2);
	}

}
