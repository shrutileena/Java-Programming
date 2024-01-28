package com.example;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "nayan";
		
		char[] wordArr = word.toCharArray();
		
		int length = wordArr.length;
		
		char[] revArr = new char[length];
		
		for(int i=length-1; i>=0; i--) {
			revArr[(length-1)-i] = wordArr[i];
		}
		
		String revWord = new String(revArr);
		
		if(word.equals(revWord)) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
		
	}

}
