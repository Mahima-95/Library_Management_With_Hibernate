package com.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Find20thPrimeNumber {

	public void findPrimeNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number:");
		// capture the input in an integer
		int num = scan.nextInt();
		scan.close();
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}

		if (flag)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");
	}

	public void find20PrimeNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = scan.nextInt();
		scan.close();
		String primeNumbers = "";
		int num = 0;
		for (int i = 1; i <= n; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to n are :");
		System.out.println(primeNumbers);

		Set<String> set = new HashSet<>();
		char[] str = primeNumbers.toCharArray();
		for (int i = 0; i < str.length - 1; i++) {
			set.add(primeNumbers);
		}
		System.out.println(set);
		
		/*ArrayList<Integer> arr = new ArrayList<Integer>();
		char[] str = primeNumbers.toCharArray();
		for (int i = 0; i < str.length - 1; i++) {
			arr.add(i);
		}*/
		
		//Integer[] arr1 = str.toInt();
		/*System.out.println("size of array -->>> " + arr.size());

		System.out.println("20th element -->>> " + arr.get(2));
		for (int i = 0; i < str.length - 1; i++) {
			System.out.println("2nd element in string array -->>> " + str[i]);
		}*/
	}
	
	public void find20PrimeNumber1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = scan.nextInt();
		scan.close();
		String primeNumbers = "";
		int num = 0;
		for (int i = 1; i <= n; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to n are :");
		System.out.println(primeNumbers);

	}

	public static void main(String[] args) {

		Find20thPrimeNumber find20thPrimeNumber = new Find20thPrimeNumber();
		// find20thPrimeNumber.findPrimeNumber();
		//find20thPrimeNumber.find20PrimeNumber();
		find20thPrimeNumber.find20PrimeNumber1();
	}
}
