package com.example.java.questions1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		
		double res = calculateFactorial(n);
		
		System.out.println("Factorial of given number " + n + " is = " + res);
		sc.close();
	}
	
	public static double calculateFactorial(double n) {
		double fact = 1;
		for(double i = 1; i<=n; i++) {
			fact *= i;
		}
		return fact;
	}
}
