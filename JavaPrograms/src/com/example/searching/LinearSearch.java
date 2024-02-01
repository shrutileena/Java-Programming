package com.example.searching;

public class LinearSearch {

	public static void main(String[] args) {

		int arr[] = { 18, 11, 3, 4, 5, 6, 7, 88 };
		int data = 7;
		
		// linear search
		for(int i=0; i< arr.length; i++) {
			if(arr[i] == data) {
				System.out.println("Element found in array");
				break;
			}
		}
	}
}
