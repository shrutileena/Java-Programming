package com.example.strings;

public class Strings {

	public static void main(String[] args) {
		String str = "abc1def";
		for(int i=0; i<str.length(); i++) {
//			System.out.println(Character.isDigit(str.charAt(i)));
			System.out.println(Character.isLowerCase(str.charAt(i)));
		}
		
	}

}
