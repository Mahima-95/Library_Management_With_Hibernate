package com.java;

import java.util.HashMap;

public class CountOccuranceCharactersUsingCollection {

	public static void occuranceNumber() {

		String str = "mahima";
		char[] arr = str.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<>();

		for (Character i : arr) {
			if (hashMap.get(i) != null && hashMap.containsKey(i)) {
				hashMap.put(i, hashMap.get(i)+1);
			} else {
				hashMap.put(i, 1);
			}
		}
		System.out.println(hashMap);
	}

	public static void main(String[] args) {
		CountOccuranceCharactersUsingCollection.occuranceNumber();
	}
}
