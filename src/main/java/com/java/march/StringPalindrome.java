package com.java.march;

import java.util.Scanner;

public class StringPalindrome {

	public boolean isPalindrome(String str) {
		boolean isPalindrome = true;
		for (int i = 0; i < str.length() - 1; i++) {
			for (int j = str.length() - 1; j > 0; j--) {
				if (str.charAt(i) != str.charAt(j))
					return isPalindrome = false;
				else
					return isPalindrome = true;
			}
		}
		return isPalindrome;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String to check it's palindrome or not--->>> ");
		String str = scanner.next();
		StringPalindrome stringPalindrome = new StringPalindrome();
		boolean result = stringPalindrome.isPalindrome(str);
		if (result)
			System.out.println("This string is palindrome..!!!");
		else
			System.out.println("This string is not a palindrome..!!!");
	}
}
