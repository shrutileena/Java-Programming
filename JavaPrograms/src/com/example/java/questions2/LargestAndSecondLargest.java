package com.example.java.questions2;

public class LargestAndSecondLargest {

	public static void main(String[] args) {

		int arr[] = { 10, 24, 15, 16 };
		int max = arr[0];
		int secondMax = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < max && secondMax < arr[i]) {
				secondMax = arr[i];
			}
		}
		
		System.out.println("Largest Number - " + max);
		System.out.println("Second Largest Number - " + secondMax);
	}
}
