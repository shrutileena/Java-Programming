package com.example.arrays;

public class SumOfArray {

	public static void main(String[] args) {

		int[] arr = { 10, 11, 12, 13, 14 };

		// using for each
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}

		// using for
		int sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum1 += arr[i];
		}

		System.out.println("Sum = " + sum);
		System.out.println("Sum = " + sum1);
	}
}
