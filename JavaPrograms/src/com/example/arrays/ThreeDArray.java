package com.example.arrays;

public class ThreeDArray {

	public static void main(String[] args) {
		int[][][] arr = new int[3][4][5];

		for (int n[][] : arr) {
			for (int v[] : n) {
				for (int g : v) {
					System.out.print(g + " ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
