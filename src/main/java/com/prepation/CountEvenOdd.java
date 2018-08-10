package com.prepation;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		int even = 0, odd = 0, sum = 0;
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

	}
}
