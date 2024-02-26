package com.example.strings;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "avaj";

		boolean isAnagram = anagramCheck(str1, str2);

		if (isAnagram) {
			System.out.println("It is an Anagram");
		} else {
			System.out.println("It is not an Anagram");
		}

	}

	public static boolean anagramCheck(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		return Arrays.equals(arr1, arr2);
	}
}
