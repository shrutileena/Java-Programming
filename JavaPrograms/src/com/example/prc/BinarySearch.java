package com.example.prc;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class BinarySearch {

	public int binarySearch(int arr[], int l, int r, int n) {
		
		if(r >= l) {
			int mid = l + (r-l) / 2;
			if(arr[mid] == n) {
				return mid;
			}
			if(arr[mid] > n) {
				return binarySearch(arr, l, mid-1, n);
			}
			return binarySearch(arr, mid+1, r, n);
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,6,7,9,10};
		int len = arr.length;
		int n=9;


//		Scanner input = new Scanner(System.in);
//		int n=input.nextInt();
		
		
		BinarySearch bs = new BinarySearch();
		int res = bs.binarySearch(arr, 0, len-1, n);
		
		if(res == -1) {
			System.out.println("number not present in array");
		} else {
			System.out.println("number found at index: " + res);
		}
		
	}

}
