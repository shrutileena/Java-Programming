package com.example.strings;

import java.util.Arrays;

public class SortCharacters {

	public static void main(String[] args) {
		String str = "shruti";
		char[] arr = str.toCharArray();
		
		Arrays.sort(arr);
		System.out.println(new String(arr));
	}

}
