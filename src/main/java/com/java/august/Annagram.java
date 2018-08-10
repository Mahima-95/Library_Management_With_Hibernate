package com.java.august;

import java.util.Arrays;
import java.util.Scanner;

public class Annagram {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string1 to find it's annagram or not");
		String str = scanner.nextLine();
		System.out.println("Enter string2 to find it's annagram or not");
		String str1 = scanner.nextLine();
		Annagram annagram = new Annagram();
		boolean result = annagram.isAnnagram(str, str1);
		if (result)
			System.out.println(str + " and " + str1 + " are annagram");
		else
			System.out.println(str + " and " + str1 + " are not annagram");

	}

	private boolean isAnnagram(String str, String str1) {
		boolean isAnnagram = true;
		if (str.length() != str1.length()) {
			isAnnagram = false;
		} else {
			char[] ch = str.toLowerCase().toCharArray();
			char[] ch1 = str1.toLowerCase().toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
			isAnnagram = Arrays.equals(ch, ch1);
		}
		return isAnnagram;
	}
}
