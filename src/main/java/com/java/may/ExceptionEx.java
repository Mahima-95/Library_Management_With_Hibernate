package com.java.may;

public class ExceptionEx {
	public static void main(String[] args) {
		try {
			int a = 5 / 0;
			System.out.println("try block");
			// throw new ArithmeticException();

			// System.exit(0);
		} catch (ArithmeticException arithmeticException) {
			System.out.println("catch block");
		} finally {
			System.out.println("finally...!!!!!!");
		}
	}
}
