package com.example.random;

public class RandomProg {

	public static void main(String[] args) {
		
		System.out.println(Math.random());
		
		// random() gives value betwen 0 and 1
		// type is double
		
		int a = (int)(Math.random() * 100);
		System.out.println(a);
	}
}
