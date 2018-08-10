package com.java.march;

public class PatternPyramid {

	public static void drawPyramidPattern() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void myStarPattern() {
		for (int r = 0; r < 5; r++) {

			for (int s = 3; s >= r; s--) {
				System.out.print(" ");
			}
			for (int c = r; c <= r * 2; c++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

	public static void myNumberPattern() {
		for (int r = 0; r < 5; r++) {

			for (int s = 3; s >= r; s--) {
				System.out.print(" ");
			}
			for (int c = r; c <= r * 2; c++) {
				System.out.print(" " + r);
			}
			System.out.println(" ");
		}
	}

	public static void myNumberPattern1() {
		for (int r = 0; r < 5; r++) {

			for (int s = 3; s >= r; s--) {
				System.out.print(" ");
			}
			for (int c = r; c <= r * 2; c++) {
				System.out.print(" " + c);
			}
			System.out.println(" ");
		}
	}

	public static void myNumberPattern2() {
		for (int r = 0; r < 5; r++) {

			for (int s = 3; s >= r; s--) {
				System.out.print(" ");
			}
			for (int c = 0; c <= r; c++) {
				System.out.print(c + " ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// drawPyramidPattern();

		myStarPattern();
		myNumberPattern();
		myNumberPattern1();
		myNumberPattern2();
	}
}
