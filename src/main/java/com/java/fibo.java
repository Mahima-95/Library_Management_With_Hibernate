package com.java;

import java.util.Scanner;

public class fibo {
	int fibo(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		else
			return fibo(n - 1) + fibo(n - 2);
	}

	public static void main(String[] args) {
		fibo fibo = new fibo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fibonacci Term :");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print(" " + fibo.fibo(i));
		}

	}
}
