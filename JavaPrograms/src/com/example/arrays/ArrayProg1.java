package com.example.arrays;

public class ArrayProg1 {

	public static void main(String[] args) {
		
		// int type array
		int arr[];	// declaration
		arr = new int[5];	// initialization
		
		int[] arr2 = new int[5];
		
		int arr3[] = new int[5];
		
		int []arr4 = new int[5];
		
		System.out.println(arr[0]);	// fetch
		
		// insert
		arr3[3] = 9;
		System.out.println(arr3[3]);	// fetch
		
		// length
		System.out.println(arr2.length);
		
		System.out.println(arr4.length);
	}
}
