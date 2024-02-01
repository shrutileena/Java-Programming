package com.example.java.questions2;

public class SumOfEvenAndOddNumbers {

	public static void main(String[] args) {

		int arr[] = { 10, 12, 13, 14, 15, 1, 2, 4, 24, 56 };
		int evenSum = 0, oddSum = 0;

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenSum += arr[i];
			} else {
				oddSum += arr[i];
			}
		}
		
		System.out.print("Array - ");
		for(int a : arr) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		System.out.println("Sum of even numbers - " + evenSum);
		System.out.println("Sum of odd numbers - " + oddSum);
	}
}
