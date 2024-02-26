package com.example;

public class LogicalOperators {

	public static void main(String[] args) {

		// &, |, !
		// AND, OR, NOT

		// Short circuit logical operators
		// &&, ||, !
		// || - it doesn't check for second condition if first is true
		// && - it doesn't check for second condition if first is false

		int a = 1, b = 2, c = 1, d = 5;

//		System.out.println(b>a & d>c);
//		System.out.println(b>a & d<c);
//		System.out.println(b>a | d>c);
//		System.out.println(!(b>a | d>c));
		System.out.println(b<a && ++d>c);	// did not go to secod condition
		System.out.println(d);
		System.out.println(b>a && ++d>c);	// it will go to second condition
		System.out.println(d);
		System.out.println(b>a || ++d>c);	// did not go to second condition
		System.out.println(d);
	}
}
