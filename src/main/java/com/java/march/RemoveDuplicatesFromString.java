package com.java.march;

import java.util.Scanner;

public class RemoveDuplicatesFromString {

	public void removeDuplicateElements(String str) {

		char[] arr = str.toCharArray();
		char[] temp = new char[arr.length];

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					temp[i] = arr[i];
				}
			}
		}
		System.out.println("Duplicate Elements--->>> ");
		System.out.println(temp);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string to reverse--->>> ");
		String str = scanner.next();
		RemoveDuplicatesFromString removeDuplicates = new RemoveDuplicatesFromString();
		removeDuplicates.removeDuplicateElements(str);
	}
}
