package com.java.august;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		String result = isPalindrome(A, 0, A.length() - 1);
		System.out.println(result);

	}

	private static String isPalindrome(String A, int first, int last) {
		if (first >= last)
			return "Yes";

		if (A.charAt(first) != A.charAt(last))
			return "No";
		return isPalindrome(A, ++first, --last);
	}

}
