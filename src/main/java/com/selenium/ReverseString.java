package com.selenium;

public class ReverseString {
	public static void main(String[] args) {
		String s = "I am in Xavient";
		System.out.println("String--->" + s);
		int len = s.length();
		System.out.print("After reverse---> ");
		for (int i = len - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			System.out.print(ch);
		}
	}
}
