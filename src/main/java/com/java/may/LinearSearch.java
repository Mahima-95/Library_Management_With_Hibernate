package com.java.may;

public class LinearSearch {
	public static int test() {
		int a[] = { 1, 11, 56, 89, 30, 2, 6, 7, 9, 0, 856 };
		int x = 2;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int result = LinearSearch.test();
		System.out.println(result);
	}
}