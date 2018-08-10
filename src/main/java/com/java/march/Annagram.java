package com.java.march;

import java.util.Arrays;
import java.util.Scanner;

public class Annagram {

	public boolean isAnnagram(String str, String str1) {

//		String s = str.replace("\\s", "");
//		String s1 = str1.replace("\\s", "");

		boolean isAnnagram = true;
		if (str.length() != str1.length()) {
			isAnnagram = false;
		} else {
			char[] arr = str.toLowerCase().toCharArray();
			char[] arr1 = str1.toLowerCase().toCharArray();

			Arrays.sort(arr);
			Arrays.sort(arr1);
			isAnnagram = Arrays.equals(arr, arr1);
		}
		return isAnnagram;
	}

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
}
