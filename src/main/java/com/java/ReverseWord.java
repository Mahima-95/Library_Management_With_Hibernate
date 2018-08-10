package com.java;

import java.util.Scanner;

public class ReverseWord {

	public void reverseWords(String str) {
		String[] words = str.split(" ");
		String reverseString = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString + reverseWord + " ";
		}
		System.out.println("Input String------> " + str);
		System.out.println("Reversed String------> " + reverseString);
	}

	public static void main(String[] args) {
		ReverseWord reverseWord = new ReverseWord();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your String");
		String str = scanner.nextLine();
		reverseWord.reverseWords(str);
	}
}