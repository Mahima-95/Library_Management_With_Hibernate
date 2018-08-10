package com.java;

import java.util.ArrayList;

public class FindPrimeNumber {

	public boolean isPrimeNumber(int num) {

		boolean isPrime = true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return isPrime = false;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		FindPrimeNumber findPrimeNumber = new FindPrimeNumber();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 2; i < 10000; i++) {
			boolean check = findPrimeNumber.isPrimeNumber(i);
			if (check == true) {
				arrayList.add(i);
			}
		}
		// if (arrayList.size() == 20) {
		System.out.println("list of all prime numbers--->>>" + arrayList);
		System.out.println("20th prime number is --->>> " + arrayList.get(19));
		// break;
		// }
	}
}
