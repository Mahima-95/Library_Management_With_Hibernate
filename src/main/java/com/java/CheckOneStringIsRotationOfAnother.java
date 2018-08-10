package com.java;

import java.util.Scanner;

public class CheckOneStringIsRotationOfAnother {

	public void checkRotation(String str, String str1) {

		if (str.length() != str1.length()) {
			System.out.println("String 2 is not a rotational version of String 1");
		} else {
			String concat2Strings = str + str1;
			if (concat2Strings.contains(str1))
				System.out.println("String 2 is a rotational version of String 1");
			else
				System.out.println("String 2 is not a rotational version of String 1");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter yout String here----->>>");
		String str = scanner.nextLine();
		String str1 = scanner.nextLine();

		CheckOneStringIsRotationOfAnother checkOneStringIsRotationOfAnother = new CheckOneStringIsRotationOfAnother();
		checkOneStringIsRotationOfAnother.checkRotation(str, str1);
	}
}
