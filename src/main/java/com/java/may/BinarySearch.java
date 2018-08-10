package com.java.may;

public class BinarySearch {

	public static int binarySearch(int a[], int l, int length, int x) {

		if (length >= 1) {
			int mid = 1 + (length - 1) / 2;
			if (a[mid] == x) {
				return mid;
			}
			if (a[mid] > x) {
				return binarySearch(a, l, mid - 1, x);
			}

			return binarySearch(a, mid + 1, length, x);
		}

		return -1;
	}

	public static void main(String[] args) {

		int a[] = { 1, 11, 56, 89, 30, 2, 6, 7, 9, 0, 856 };
		int length = a.length;
		int x = 2;
		int result = BinarySearch.binarySearch(a, 0, length - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

}
