package com.example.arrays;

public class JaggedArray {

	public static void main(String[] args) {

		// 1 , 2, 3
		// 4, 5
		// 6, 7, 8, 9
		
		int[][] nums = new int[3][];
		
		nums[0] = new int[3];
		nums[1] = new int[2];
		nums[2] = new int[4];
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				nums[i][j] = (int)(Math.random() * 10);
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int n[]: nums) {
			for(int v: n) {
				System.out.print(v + " ");
			}
			System.out.println();
		}
	}

}
