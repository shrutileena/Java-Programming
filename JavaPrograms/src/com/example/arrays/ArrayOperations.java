package com.example.arrays;

import java.util.Scanner;

public class ArrayOperations {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		// length operation
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the number for the index " + i + " - ");
			arr[i] = sc.nextInt();
		}
		
		displayArray(arr);
		
		sc.close();
	}
	
	public static void displayArray(int[] array) {
		
		// for each loop
		for(int a: array) {
			System.out.println(a);
		}
	}
}
