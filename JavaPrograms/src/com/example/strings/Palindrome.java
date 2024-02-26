package com.example.strings;

public class Palindrome {

	public static void main(String[] args) {

		String str = "mommy";

		findPalindrome(str);
		findPalindrome1(str);
		findPalindrome2(str);
	}

	public static void findPalindrome(String str) {
		char[] arr = str.toCharArray();

		StringBuffer sb = new StringBuffer();

		for (int i = arr.length - 1; i >= 0; i--) {
			sb.append(arr[i]);
		}

		if (sb.toString().equals(str)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
	}

	public static void findPalindrome1(String str) {
		StringBuffer sbr = new StringBuffer(str);
		String rstr = sbr.reverse().toString();

		if (rstr.equals(str)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
	}

	public static void findPalindrome2(String str) {
		char[] arr = str.toCharArray();
		char[] newarr = new char[arr.length];
		int j = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			newarr[j] = arr[i];
			j++;
		}

		String reverse = new String(newarr);

		if (reverse.equals(str)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
	}

}
