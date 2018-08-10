package com.inheritance;

public class B extends A{
	public void sum() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		A a = new B();
		a.sum();
	}
}
