package com.selenium;

public class Parent2 {
	public Parent2() {
		this(55);
		System.out.println("parent default method");
	}
	
	public Parent2(int a) {
		System.out.println("Parent 1 Parameterized method");
	}
}
