package com.java;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicates {

	public static void test() {
		HashMap<Character, Integer> hashMap = new HashMap<>();
		String str = "mahima";
		System.out.println("Actual String " + str);
		char[] arr = str.toCharArray();
		for (Character character : arr) {
			if (hashMap.containsKey(character) && hashMap.get(character) != null) {
				hashMap.put(character, hashMap.get(character) + 1);
			} else {
				hashMap.put(character, 1);
			}
		}

		Set<Character> set = hashMap.keySet();
		for (Character character : set) {
			if (hashMap.get(character) > 1) {
				System.out.println(character + " : " + hashMap.get(character));
			}
		}
	}

	public static void main(String[] args) {
		FindDuplicates.test();
	}
}
