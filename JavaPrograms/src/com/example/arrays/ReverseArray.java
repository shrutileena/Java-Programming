package com.example.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] arr = { 10, 11, 12, 13, 14 };
		
		// using for
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
