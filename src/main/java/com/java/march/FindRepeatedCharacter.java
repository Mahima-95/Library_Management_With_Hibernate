package com.java.march;

import java.util.HashMap;
import java.util.Scanner;

public class FindRepeatedCharacter {
	public void repeatingCharacter(String str) {

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
		System.out.println(hashMap);
	}

	public static void main(String[] args) {
		FindRepeatedCharacter repeatedCharacter = new FindRepeatedCharacter();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your String");
		String str = scanner.nextLine();
		repeatedCharacter.repeatingCharacter(str);
	}
}
