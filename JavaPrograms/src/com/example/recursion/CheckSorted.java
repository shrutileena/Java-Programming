package com.example.recursion;

public class CheckSorted {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 8, 6 };
		boolean isorted = checkArray(arr, 1);
		
		if(isorted) {
			System.out.println("sorted");
		} else {
			System.out.println("not sorted");
		}
	}

	public static boolean checkArray(int[] arr, int i) {

		// base condition
		if(i==arr.length) return true;
		
		// work
		if (arr[i] < arr[i - 1]) {
			return false;
		}
		
		// Recursive call
		return checkArray(arr, i + 1);

	}

}
