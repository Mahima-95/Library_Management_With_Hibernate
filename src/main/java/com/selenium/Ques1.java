package com.selenium;

import java.util.Scanner;

public class Ques1 {
	public static void main(String[] args) {
		System.out.println("Enter number-- ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int temp, sum = 0;
		temp = n;
		while (n > 0) {
			int res = n % 10;
			sum = (sum * 10) + res;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("it's a palindrome number..!!!");
		} else {
			System.out.println("it's not a palindrome number..!!!!");
		}
	}
}
