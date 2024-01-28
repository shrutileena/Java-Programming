package com.example.java.core.basicprograms;

import java.util.Scanner;

public class ReadNumberFromStandardInput {

	public static void main(String[] args) {
		
		// Scanner - java.util.Scanner
		// System - java.lang
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int n =  scanner.nextInt();
		System.out.println("Entered number: " + n);
		
		scanner.close();
		
	}

}
