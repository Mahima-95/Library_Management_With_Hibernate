package com.selenium;

public class Child extends Parent {

	public Child() {
		System.out.println("child default");
	}

	public static void main(String[] args) {
		Child ref = new Child();
	}

}
