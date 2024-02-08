package com.example.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 30, 11, 9, 16, 2 };

		System.out.println("Array before sorting");
		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("Array after sorting");
		System.out.println(Arrays.toString(arr));

	}

	public static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j+1]=key;
		}

	}

}
