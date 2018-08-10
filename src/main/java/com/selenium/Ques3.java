package com.selenium;

import java.util.Scanner;

public class Ques3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your marks--");
		int a = scanner.nextInt();

		
		if ((a > 0) && (a < 40)) {
			System.out.println("fail");
		} else if ((a > 40) && (a < 60)) {
			System.out.println("3rd");
		} else if ((a > 60) && (a < 75)) {
			System.out.println("2nd");
		} else if ((a > 75) && (a < 90)) {
			System.out.println("1st");
		} else if ((a > 90) && (a < 100)) {
			System.out.println("excellent");
		} else {
			System.out.println("you have entered wrong number...!!!");
		}
	}
}
