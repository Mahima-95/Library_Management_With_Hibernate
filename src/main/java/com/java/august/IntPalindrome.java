package com.java.august;

import java.util.Scanner;

public class IntPalindrome {
	public static void main(String[] args) {
		System.out.println("Please Enter a number : ");
		int palindrome = new Scanner(System.in).nextInt();

		if (isPalindrome(palindrome))
			System.out.println("Number : " + palindrome + " is a palindrome");
		else
			System.out.println("Number : " + palindrome + " is not a palindrome");

	}

	private static boolean isPalindrome(int palindrome) {
		int number = palindrome;
		int reverse = 0;

		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		if (palindrome == reverse)
			return true;
		return false;
	}
}
