package com.java.march;

import java.util.Scanner;

public class FindArmstrong {

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
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to check it's armstrong or not--->>> ");
		int num = scanner.nextInt();
		FindArmstrong armstrong = new FindArmstrong();
		boolean check = armstrong.isArmstrong(num);
		if (check)
			System.out.println("It's a armstrong");
		else
			System.out.println("It's not a armstrong");
	}
}
