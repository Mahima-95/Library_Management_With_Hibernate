package com.java.may;

public class InsertionSort {

	void insertionSort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		int arr[] = { 10, 20, 50, 6, 80, 7 };
		insertionSort.insertionSort(arr);
		System.out.println("Sorted array");
		insertionSort.printArray(arr);
	}
}
