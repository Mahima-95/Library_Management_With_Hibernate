package com.java;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = "Hello Mahima..!!";
		String removeSpaces = str.replaceAll(" ", ".");
		System.out.println(removeSpaces);
	}
}
