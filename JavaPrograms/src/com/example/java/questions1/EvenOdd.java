package com.example.java.questions1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String res = findEvenOrOdd(n);
		System.out.println(res);
		
		sc.close();
	}
	
	public static String findEvenOrOdd(int n) {
		String r = null;
		
		if(n%2 == 0) {
			r = "Even";
		} else {
			r = "Odd";
		}
		return r;
	}
}
