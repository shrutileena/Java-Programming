package com.example.java.questions2;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int arr[] = new int[5];
//		int indexes[] = new int[arr.length];
//		int k = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter vaue for index " + i + " - ");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				arr[i] = 0;
//				indexes[k] = i + 1;
//				k++;
			}
		}

//		for (int i : indexes) {
//			if (i != 0)
//				arr[i] = 0;
//		}

		System.out.println("Enter Array after removing duplicates - ");
		for (int a : arr) {
			System.out.println(a);
		}

		sc.close();
	}
}
