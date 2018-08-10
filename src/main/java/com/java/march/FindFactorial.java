package com.java.march;

import java.util.Scanner;

public class FindFactorial {

	public int isFactorialUsingIteration(int num) {

		int result = 1;
		for (int i = num; i > 0; i--) {
			result = result * i;
		}
		return result;
	}

	public int isFactorialUsingRecursion(int num) {

		if (num == 0)
			return 1;

		return num * isFactorialUsingRecursion(num - 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to get it's factorial--->>> ");
		int num = scanner.nextInt();
		FindFactorial findFactorial = new FindFactorial();
		int result = findFactorial.isFactorialUsingIteration(num);
		System.out.println(result);
		int resultFromRecursion = findFactorial.isFactorialUsingRecursion(num);
		System.out.println(resultFromRecursion);
	}
}
