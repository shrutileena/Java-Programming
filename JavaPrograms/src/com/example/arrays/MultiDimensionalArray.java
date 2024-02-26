package com.example.arrays;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		// array of arrays
		int[][] arr = new int[2][3];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 2;
		arr[1][1] = 2;
		arr[1][2] = 3;
		
		System.out.println(arr[1][0]);
		
		// for loop
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// for each
		for(int n[]: arr) {
			for(int v: n) {
				System.out.print(v + " ");
			}
			System.out.println();
		}
	}

}
