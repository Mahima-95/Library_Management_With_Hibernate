package com.java.march;

import java.util.HashMap;
import java.util.Scanner;

public class March_Find_Duplicates {

	public void duplicateCharacters(String data) {

		String lower = data.toLowerCase();
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
		March_Find_Duplicates duplicates = new March_Find_Duplicates();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string to find dulicate characters--->>>");
		String data = scanner.nextLine();
		duplicates.duplicateCharacters(data);
	}
}
