package com.example.java.core.basicprograms;

public class Palindrome {

	public static void main(String[] args) {

		int a = 101;
		int n = a;
		int rev = 0;
		while(a > 0 ) {
			int rem = a % 10; 
			rev = (rev * 10) + rem;
			a = a / 10;
		}
		if(n == rev) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}

	}

}
