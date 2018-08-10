package com.java.march;

import java.util.Scanner;

public class IntegerPalindrome {

	public boolean isPalindrome(int num) {
		int reverse = 0;
		int temp = num;
		for (int i = 0; i < num;) {
			int rem = num % 10;
			reverse = (reverse * 10) + rem;
			num = num / 10;
		}
		if (temp == reverse)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to check it's palindrome or not--->>> ");
		int num = scanner.nextInt();
		IntegerPalindrome integerPalindrome = new IntegerPalindrome();
		boolean check = integerPalindrome.isPalindrome(num);
		if (check)
			System.out.println("It's a palindrome");
		else
			System.out.println("It's not a palindrome");
	}
}
