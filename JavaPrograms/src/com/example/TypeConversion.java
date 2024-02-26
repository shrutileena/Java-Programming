package com.example;

public class TypeConversion {

	public static void main(String[] args) {

		// type casting - explicit
		int a = 12;
		int y = 257;
		byte b = (byte) a; // b can store 12 i.e in the range so we can typecast it

		byte z = (byte) y; // here it use modulus on y (257) % range of int (256) = 1
		System.out.println(b);
		System.out.println(z);

		// float and int
		float f = 5.6f;
		int x = (int) f;
		System.out.println(x);

		// type conversion - implicit
		int c = 1256;
		byte d = 121;
		c = d;
		System.out.println(c); // Implicitly it converted type and stores byte in int

		// Type Promotion
		byte r = 10;
		byte s = 30;
		int result = (r * s);
		System.out.println(result);
	}

}
