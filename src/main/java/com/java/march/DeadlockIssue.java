package com.java.march;

public class DeadlockIssue {

	public void test1() {
		synchronized (String.class) {
			System.out.println("Aquired lock on String.class object");

			synchronized (Integer.class) {
				System.out.println("Aquired lock on Integer.class object");
			}
		}
	}

	public void test2() {

		synchronized (Integer.class) {
			System.out.println("Aquired lock on Integer.class object");

			synchronized (String.class) {
				System.out.println("Aquired lock on String.class object");

			}
		}
	}

	public static void main(String[] args) {

	}
}
