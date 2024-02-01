package com.example.java.questions2;

public class StoreArrayInAnotherArrayInReverse {

	public static void main(String[] args) {
		
		int arr1[] = {12, 13};
		int arr2[] = new int[arr1.length];
//		int j=0;
		
		for(int i=arr1.length-1; i>=0; i--) {
			arr2[(arr1.length-1) - i] = arr1[i];
//			j++;
		}
		
		for(int a: arr2) {
			System.out.println(a);
		}
	}
}
