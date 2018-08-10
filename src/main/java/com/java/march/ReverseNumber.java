package com.java.march;

import java.util.Scanner;

public class ReverseNumber {

	public void numberReverse(int num) {

		int reverse = 0, remainder = 0;

		for (int i = 0; i < num;) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println(reverse);
	}

	public static void main(String[] args) {
		ReverseNumber reverseNumber = new ReverseNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your number");
		int num = scanner.nextInt();
		reverseNumber.numberReverse(num);
	}
}
