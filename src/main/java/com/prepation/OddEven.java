package com.prepation;

public class OddEven {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 4, 6, 8 };
		System.out.println("Even numbers---> ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("");
		System.out.println("Odd numbers--->");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
