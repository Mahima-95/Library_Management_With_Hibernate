package com.java;

import java.util.Scanner;

public class ReverseString {

	public void reverseUsingCharAtMethod(String str) {
		System.out.println("Reversed String--> ");
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			System.out.print(ch);
		}
	}

	public void reverseUsingCharArrayMethod(String str) {
		System.out.println("Reversed String--> ");
		char[] arr = str.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}

	public String reverseUsingRecursiveMethod(String str) {
		if ((null == str) || (str.length() <= 1)) {
			return str;
		}

		return reverseUsingRecursiveMethod(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {

		ReverseString reverseString = new ReverseString();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your String");
		String str = scanner.nextLine();
		 reverseString.reverseUsingCharAtMethod(str);
		// reverseString.reverseUsingCharArrayMethod(str);
		//reverseString.reverseUsingRecursiveMethod(str);
	}
}
