package com.example.strings;

public class ReverseWords {

	public static void main(String[] args) {

		String str = "I love programming";
		reverseUsingMethod(str);
		System.out.println();
		reverseWithoutMethod(str);
	}

	private static void reverseWithoutMethod(String str) {
		char[] strArray = str.toCharArray();
		
		int count = 1;
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] == ' ') {
				count++;
			}
		}
		String[] words = new String[count];
		int j=0;
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] != ' ') {
				if(words[j]==null) {
					words[j]="";
				}
				words[j]+=strArray[i];
			} else{
				j++;
			}
		}
		for(int i=words.length-1; i>=0; i--) {
			System.out.print(words[i]+" ");
		}
	}

	public static void reverseUsingMethod(String str) {
		String[] words = str.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
	}
}
