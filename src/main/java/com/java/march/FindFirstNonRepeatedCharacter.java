package com.java.march;

import java.util.HashMap;
import java.util.Scanner;

public class FindFirstNonRepeatedCharacter {

	public char nonRepeatingCharacter(String str) {

		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (hashMap.containsKey(ch)) {
				hashMap.put(ch, hashMap.get(ch) + 1);
			} else {
				hashMap.put(ch, 1);
			}
		}	

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (hashMap.get(ch) == 1)
				return ch;
		}
		throw new RuntimeException("Undefined behaviour");
	}

	public static void main(String[] args) {
		FindFirstNonRepeatedCharacter firstNonRepeatedCharacter = new FindFirstNonRepeatedCharacter();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your String");
		String str = scanner.nextLine();
		char res = firstNonRepeatedCharacter.nonRepeatingCharacter(str);
		System.out.println(res);
	}
}
