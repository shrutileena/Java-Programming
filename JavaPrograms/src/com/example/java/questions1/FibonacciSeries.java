package com.example.java.questions1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		// 1, 1, 2, 3, 5, 8, 13, ... so on

		int firstNumber = 1, secondNumber = 1;

		System.out.println("Enter n - ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];

		arr[0] = firstNumber;
		arr[1] = secondNumber;

		for (int i = 2; i < n; i++) {
			int next = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = next;
			arr[i] = next;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();
	}
}
