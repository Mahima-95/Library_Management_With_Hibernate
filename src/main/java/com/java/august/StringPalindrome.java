package com.java.august;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String to check it's palindrome or not--->>> ");
		String str = scanner.next();
		boolean result = isPalindrome(str);
		if (result)
			System.out.println("This string is palindrome..!!!");
		else
			System.out.println("This string is not a palindrome..!!!");
	}

	private static boolean isPalindrome(String str) {
		boolean isPalin = true;
		for (int i = 0; i < str.length() - 1; i++) {
			for (int j = str.length() - 1; j > 0; j--) {
				if (str.charAt(i) != str.charAt(j))
					return isPalin = false;
				else
					return isPalin = true;

			}
		}
		return isPalin;
	}
}
