package com.example.recursion;

public class Print {

	public static void main(String[] args) {
		print123(10);
	}

	public static void print123(int n) {

		// base case
		if (n == 0)
			return;

		// recursive call
		// stack building
		print123(n - 1);

		System.out.println(n); // printing

	}
}
