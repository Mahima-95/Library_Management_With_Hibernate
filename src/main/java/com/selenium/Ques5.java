package com.selenium;

public class Ques5 {
	public static void main(String[] args) {
		int k = 3;
		for (int r = 0; r < 4; r++) {
			for (int s = 0; s < k; s++) {
				System.out.print(" ");
			}
			k = k - 1;
			for (int c = 0; c < r; c++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
}
