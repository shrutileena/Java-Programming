package com.example.arrays;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		int elementToRemove = 3;
		
		removeElement(arr, elementToRemove);
		
		int[] arr1 = { 1, 2, 3, 4, 5 };
		
		removeElement2(arr1, elementToRemove);

	}

	public static void removeElement(int[] arr, int element) {
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				index = i;
			}
		}

		for (int i = index; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = 0;

		System.out.println(Arrays.toString(arr));
	}
	
	public static void removeElement2(int[] arr, int element) {
		int[] newArr = new int[arr.length-1];
		int j=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==element) {
				continue;
			}
			newArr[j] = arr[i];
			j++;
		}
		
		System.out.println(Arrays.toString(newArr));
	}
}
