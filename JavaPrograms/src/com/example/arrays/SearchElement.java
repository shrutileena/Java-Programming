package com.example.arrays;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Print size of array - ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter element for index " + i);
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter number to find in the array - ");
		int n = sc.nextInt();

		boolean isNumber = false;
		int index = 0;

		for (int i = 0; i < size; i++) {
			if (n == arr[i]) {
				isNumber = true;
				index = i;
				break;
			}
		}

		if (isNumber) {
			System.out.println("The number is present in the array at index - " + index);
		} else {
			System.out.println("The number is not present in the array");
		}
		sc.close();
	}
}
