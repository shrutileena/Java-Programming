package com.example.java.questions2;

public class MaxElement {

	public static void main(String[] args) {
		
		int arr[] =  {10, 24, 15, 16};
		
		int max = arr[0];
		
		for(int a: arr) {
			if(a > max) {
				max = a;
			}
		}
		
		for(int a: arr) {
			System.out.print(a + " ");
		}
		
		System.out.println("maximum element in array is " + max);
	}
}
