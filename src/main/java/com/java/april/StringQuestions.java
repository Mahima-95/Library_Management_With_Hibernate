package com.java.april;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class StringQuestions {

	public String isPalindrome(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = str.length() - 1; j > 0; j--) {
				if (str.charAt(i) != str.charAt(j)) {
					return "It's not a palindrome";
				} else {
					return "It's a palindrome";
				}
			}
		}
		return str;
	}

	public void reverseString(String str) {

		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			System.out.print(ch);
		}
	}

	public boolean isAnnagram(String str1, String str2) {

		boolean isAnnagram = true;
		if (str1.length() != str2.length()) {
			isAnnagram = false;
		} else {
			char[] arr1 = str1.toLowerCase().toCharArray();
			char[] arr2 = str2.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			isAnnagram = Arrays.equals(arr1, arr2);
		}
		return isAnnagram;
	}

	public void removeDuplicates(String str) {
		char arr[] = str.toCharArray();
		char temp[] = new char[arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					temp[i] = arr[i];
				}
			}
		}
		System.out.println("Duplicate Elements--->>> ");
		System.out.println(temp);
	}

	public void countCharacterOccurances(String str) {
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

	public char findFirstNonRepeatedCharacter(String str) {

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
		throw new RuntimeException("Undefined behaviour");
	}

	public static void main(String[] args) {
		StringQuestions questions = new StringQuestions();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your String here:-");
		String str = scanner.nextLine();
		// String checkPalindrome = questions.isPalindrome(str);
		// System.out.println("Check Palindrome--->>> " + checkPalindrome);
		System.out.print("Reversed String---->>> ");
		// questions.reverseString(str);
		/*
		 * System.out.println();
		 * System.out.println("Enter string 1 to find it's annagram or not");
		 * String str1 = scanner.nextLine();
		 * System.out.println("Enter string 2 to find it's annagram or not");
		 * String str2 = scanner.nextLine(); boolean result =
		 * questions.isAnnagram(str1, str2); if (result) System.out.println(str1
		 * + " and " + str2 + " are annagram"); else System.out.println(str1 +
		 * " and " + str2 + " are not annagram");
		 */

		System.out.println("Check duplicate character---->>>> ");
		questions.removeDuplicates(str);

		System.out.println("Count Character Occurances--->>> ");
		questions.countCharacterOccurances(str);

		System.out.println("First Non Repeated Character--->>> ");
		char findNonRepeatedCharacter = questions.findFirstNonRepeatedCharacter(str);
		System.out.println(findNonRepeatedCharacter);
	}
}
