package com.java;

import java.util.HashMap;

public class RepeatedCharacter {
	public void test() {
		String s = "Hello Mahima!";
		String lower = s.toLowerCase();
		char[] arr = lower.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (Character i : arr) {
			if (hashMap.containsKey(i) && hashMap.get(i) != null) {
				hashMap.put(i, hashMap.get(i) + 1);
			} else {
				hashMap.put(i, 1);
			}
		}
		System.out.println(hashMap);
	}

	public static void main(String[] args) {
		RepeatedCharacter repeatedCharacter = new RepeatedCharacter();
		repeatedCharacter.test();
	}
}
