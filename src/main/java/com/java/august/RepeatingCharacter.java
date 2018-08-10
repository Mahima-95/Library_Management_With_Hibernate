package com.java.august;

import java.util.HashMap;
import java.util.Scanner;

public class RepeatingCharacter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your String");
		String str = scanner.nextLine();
		char res = repeatingCharacter(str);
		System.out.println(res);
	}

	private static char repeatingCharacter(String str) {

		String lower = str.toLowerCase();
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < lower.length(); i++) {
			char ch = lower.charAt(i);
			if (hashMap.containsKey(ch)) {
				hashMap.put(ch, hashMap.get(ch) + 1);
			} else {
				hashMap.put(ch, 1);
			}
		}

		for (int i = 0; i < lower.length(); i++) {
			char ch = lower.charAt(i);
			if (hashMap.get(ch) == 1)
				return ch;
		}
		// System.out.println(hashMap);
		throw new RuntimeException("Undefined behaviour");
	}
}
