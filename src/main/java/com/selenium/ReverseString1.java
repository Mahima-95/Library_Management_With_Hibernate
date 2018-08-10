package com.selenium;

public class ReverseString1 {
	public static void main(String[] args) {
		String str = "I am in Xavient ";
		String splitString = str.substring(8, 16);
		String splitString1 = str.substring(5, 8);
		String splitString2 = str.substring(2, 5);
		String splitString3 = str.substring(0, 2);
		System.out.println(splitString + splitString1 + splitString2 + splitString3);
	}
}
