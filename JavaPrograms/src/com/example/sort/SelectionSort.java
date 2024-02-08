package com.example.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 30, 11, 9, 16, 2 };

		System.out.println("Array before sorting");
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("Array after sorting");
		System.out.println(Arrays.toString(arr));

	}

	public static void selectionSort(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			int index = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[index]) {
					index = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[index];
			arr[index] = tmp;
		}
		
	}

}
