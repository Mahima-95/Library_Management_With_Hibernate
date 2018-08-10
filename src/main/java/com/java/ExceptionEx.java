package com.java;

public class ExceptionEx {
	public static void main(String[] args) {
		int a = 5, b = 0;
		int c = a / b;
		try {

			System.out.println(c);
			System.out.println("try block");
		} catch (Exception exception) {

		} finally {
			System.out.println("finally block");
		}
	}
}
