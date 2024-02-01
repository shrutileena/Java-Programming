package com.example.java.questions2;

public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = { 12, 13, 14, 10, 11 };

		int i = arr.length - 1;
		while (i >= 0) {
			System.out.println(arr[i]);
			i--;
		}
	}
}
