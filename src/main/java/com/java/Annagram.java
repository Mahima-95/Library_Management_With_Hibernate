package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class Annagram {

	public void annagram(String str, String str1) {

		String s = str.replaceAll("\\s", "");
		String s1 = str1.replaceAll("\\s", "");

		boolean status = true;
		if (s.length() != s1.length()) {
			status = false;
		} else {
			char[] arr = s.toLowerCase().toCharArray();
			char[] arr1 = s1.toLowerCase().toCharArray();
			Arrays.sort(arr);
			Arrays.sort(arr1);
			status = Arrays.equals(arr, arr1);
		}
		if (status)
			System.out.println(str + " and " + str1 + " are anagrams");
		else
			System.out.println(str + " and " + str1 + " are not anagrams");
	}

	static void isAnagram(String str1, String str2) {
		String s1 = str1.replaceAll("\\s", "").toLowerCase();
		String s2 = str2.replaceAll("\\s", "").toLowerCase();
		boolean status = true;
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			char[] arr = s1.toCharArray();
			for (char c : arr) {
				int index = s2.indexOf(c);
				if (index != -1) {
					s2 = s2.substring(0, index) + s2.substring(index + 1, s2.length());
				} else {
					status = false;
					break;
				}
			}
		}
		if (status) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}

	public static void main(String[] args) {
		Annagram annagram = new Annagram();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your String");
		String str = scanner.nextLine();
		String str1 = scanner.nextLine();
		//annagram.annagram(str, str1);

		Annagram.isAnagram(str, str1);

	}
}
