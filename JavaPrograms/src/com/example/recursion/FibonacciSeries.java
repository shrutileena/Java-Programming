package com.example.recursion;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n = 5;
		int res = fibonacci(n); // gives number at nth position in fibonacci series
		System.out.println(res);
	}

	public static int fibonacci(int n) {
		
		// base case
		if(n<=1) {
			return n;
		}
		
		// work - recursive call
		int res = fibonacci(n-1) + fibonacci(n-2);
		return res;
	}

}
