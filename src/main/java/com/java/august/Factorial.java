package com.java.august;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to get it's factorial--->>> ");
		int num = scanner.nextInt();

		int result = isFactorialUsingIteration(num);
		System.out.println(result);
		//int resultFromRecursion = isFactorialUsingRecursion(num);
		//System.out.println(resultFromRecursion);

	}

	private static int isFactorialUsingIteration(int num) {
		int result = 1;
		for (int i = num; i > 0; i--) {
			result = result * i;
		}
		return result;
	}
}
