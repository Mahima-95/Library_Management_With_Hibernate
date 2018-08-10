package com.java.march;

import java.util.Scanner;

public class GCD {

	private static int findGCD(int num1, int num2) {

		if (num2 == 0)
			return num1;
		return findGCD(num2, num1 % num2);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first number to find GCD");
		int number1 = scanner.nextInt();
		System.out.println("Please enter second number to find GCD");
		int number2 = scanner.nextInt();
		int result = findGCD(number1, number2);
		System.out.println("GCD of two numbers " + number1 + " and " + number2 + " is :" + result);

	}
}
