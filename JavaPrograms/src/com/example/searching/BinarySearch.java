package com.example.searching;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { 10, 11, 12, 13, 14, 15, 16, 17 };

		int data = 16;

		int res = binarySearch(arr, data);

		if (res == -1) {
			System.out.println("Element is not in the array");
		} else {
			System.out.println("Element is found at " + res + " position.");
		}

	}

	public static int binarySearch(int[] arr, int data) {
		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] < data) {
				lo = mid + 1;
			} else if (arr[mid] > data) {
				hi = mid - 1;
			} else {
				return mid;
			}
		}

		return -1; // if nothing found then returns -1
	}
}
