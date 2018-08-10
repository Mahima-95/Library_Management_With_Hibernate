package com.java.march;

import java.util.Scanner;

public class FindPrimeNumbers {

	public boolean isPrime(int num) {
		boolean isPrime = true;
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0)
				return isPrime = false;
		}
		return isPrime;
	}

	// Method is not running
	/*
	 * public String isPrimeWithoutMethods(int num) { if (num < 0) return
	 * "not valid"; if (num == 0 || num == 1) return "Not a prime number"; if
	 * (num == 2 || num == 3) return "It's a prime number"; if ((num * num - 1)
	 * % 24 == 0) return "It's a prime number"; else return
	 * "Not a prime number"; }
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to get it's prime or not--->>> ");
		int num = scanner.nextInt();
		FindPrimeNumbers findPrimeNumbers = new FindPrimeNumbers();

		boolean result = findPrimeNumbers.isPrime(num);
		if (result) {
			System.out.println("It is a prime number");
		} else {
			System.out.println("It is not a prime number");
		}

		// findPrimeNumbers.isPrimeWithoutMethods(num);
	}
}
