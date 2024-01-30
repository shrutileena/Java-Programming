package com.example.java.questions1;

public class LargestNumber {

	public static void main(String[] args) {

		int a = 1, b = 5, c = 2;

		System.out.println("a - " + a);
		System.out.println("b - " + b);
		System.out.println("c - " + c);
		System.out.println(
				"Largest of a, b and c is - " + ((a > b) ? (a > c ? a : b > c ? b : c) : (b > c ? b : a > c ? a : c)));
	}
}
