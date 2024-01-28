package com.example;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		
		b = a+b;
		a = b-a;
		b = b-a;
		
		System.out.println("a - "+a);
		System.out.println("b - "+b);
		
	}
}
