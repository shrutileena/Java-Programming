package com.example.recursion;

public class Print {

	public static void main(String[] args) {
		printAsc(10);
		System.out.println("---------------------");
		printDesc(10);
	}

	private static void printDesc(int i) {
		
		if(i==0) return;
		
		System.out.println(i);
		printDesc(i-1);
		
	}

	public static void printAsc(int n) {

		// base case
		if (n == 0)
			return;

		// recursive call
		// stack building
		printAsc(n - 1);

		System.out.println(n); // printing

	}
}
