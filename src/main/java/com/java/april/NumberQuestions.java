package com.java.april;

import java.util.Scanner;

public class NumberQuestions {

	public void reverseNumber(int num) {

		int reverse = 0, remainder = 0;
		for (int i = 0; i < num;) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println(reverse);
	}

	public boolean isArmstrong(int num) {
		int temp = num;
		int result = 0;
		for (int i = 0; i < num;) {
			int rem = num % 10;
			result = result + rem * rem * rem;
			num = num / 10;
		}
		if (temp == result)
			return true;
		return false;
	}

	public static void main(String[] args) {
		NumberQuestions questions = new NumberQuestions();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number here:-");
		int num = scanner.nextInt();
		//questions.reverseNumber(num);
		boolean result = questions.isArmstrong(num);
		if (result) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("not a armstrong number");
		}
	}
}
