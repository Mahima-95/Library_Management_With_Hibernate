package com.java.march;

public class AvoidDeadlockIssue {

	public void test1() {
		synchronized (Integer.class) {
			System.out.println("Aquired lock on Integer.class object");

			synchronized (String.class) {
				System.out.println("Aquired lock on String.class object");
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
		AvoidDeadlockIssue deadlockIssue = new AvoidDeadlockIssue();
		deadlockIssue.test1();
		deadlockIssue.test2();
	}

}
