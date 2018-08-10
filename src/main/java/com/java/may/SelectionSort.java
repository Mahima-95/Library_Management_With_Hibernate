package com.java.may;

public class SelectionSort {

	void selectionSort(int arr[]) {

		int length = arr.length;
		for (int i = 0; i < length - 1; i++) {
			int min_index = i;
			for (int j = i + 1; j < length; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
				int temp = arr[min_index];
				arr[min_index] = arr[i];
				arr[i] = temp;
			}
		}
	}

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();
		int arr[] = { 10, 20, 50, 6, 80, 7 };
		selectionSort.selectionSort(arr);
		System.out.println("Sorted array");
		selectionSort.printArray(arr);
	}
}
