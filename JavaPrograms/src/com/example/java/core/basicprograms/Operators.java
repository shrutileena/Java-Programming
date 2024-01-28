package com.example.java.core.basicprograms;

public class Operators {

	public static void main(String[] args) {

		boolean a = true;
		boolean b = false;

		System.out.println(a & b); // bitwise operator
		System.out.println(a && b);

		System.out.println(a | b); // bitwise operator
		System.out.println(a || b);

		int x = 10;
		int y = 2;

		System.out.println(x << y); // left shift
		System.out.println(x >> y); // right shift

		int w = 645;
		int u = 3;

		System.out.println(w << u);	// left shift

		// combined left shift and right shift

		int v = 2;
		int z = v << 2 + v >> 1;	// operator precedence : (left to right) and addition, left shift, right shift
		System.out.println(z);

		System.out.println(2 >> 1);
		System.out.println(2 << 2);

		int m = 6;
		int n = m << 8 - m << 2;	// operator precedence : (left to right) and subtraction, left shift (left to right)
		System.out.println(n);
	}
}
