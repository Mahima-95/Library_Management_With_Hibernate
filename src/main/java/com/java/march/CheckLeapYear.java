package com.java.march;

import java.util.Scanner;

public class CheckLeapYear {

	public String isLeapYear(int num) {

		String str = null;
		if (num % 4 == 0)
			str = "leap year";
		else
			str = "not a leap year";
		return str;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year to get it's leap year or not");
		int num = scanner.nextInt();
		CheckLeapYear checkLeapYear = new CheckLeapYear();
		String result = checkLeapYear.isLeapYear(num);
		System.out.println(result);
	}
}
