package com.example.prc;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String word = input.nextLine();
		
		char[] wordChArray = word.toCharArray();
		int size = wordChArray.length;
		char[] reversedArray = new char[size];
		int j=0;
		
		for(int i=size-1; i>=0; i--) {
			reversedArray[j]=wordChArray[i];
			j++;
		}
		
		String reversedWord = new String(reversedArray);
		if(reversedWord.equalsIgnoreCase(word)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
	}

}
