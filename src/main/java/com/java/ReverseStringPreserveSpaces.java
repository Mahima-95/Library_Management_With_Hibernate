package com.java;

import java.util.Scanner;

public class ReverseStringPreserveSpaces {

	public void preserveSpaces(String str) {

		char[] arr = str.toCharArray();
		char[] arr1 = new char[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ') {
				arr1[i] = ' ';
			}
		}

		int j = arr1.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				if (arr1[j] == ' ') {
					j--;
				}
				arr1[j] = arr[i];
				j--;
			}
		}
		String result = String.valueOf(arr1);
		System.out.println(str + "---> " + result);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter yout String here----->>>");
		String str = scanner.nextLine();

		ReverseStringPreserveSpaces reverseStringPreserveSpaces = new ReverseStringPreserveSpaces();
		reverseStringPreserveSpaces.preserveSpaces(str);
	}
}
