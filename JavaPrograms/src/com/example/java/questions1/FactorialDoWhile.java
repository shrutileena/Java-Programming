package com.example.java.questions1;

import java.util.Scanner;

public class FactorialDoWhile {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sc.close();
		
		int fact = 1, i = 1;
		
		do {
			
			fact *= i;
			i++;
			
		}while(i<=n);
		
		System.out.println("Factorial is - " + fact);
	}
}
