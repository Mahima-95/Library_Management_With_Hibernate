package com.java.march;

import java.util.Scanner;

public class ReverseString {

	public void reverseString(String str) {

		System.out.print("Reverse string -->> ");
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string to reverse--->>> ");
		String str = scanner.next();
		ReverseString reverseString = new ReverseString();
		reverseString.reverseString(str);
	}
}
