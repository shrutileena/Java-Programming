package com.example.java.core.basicprograms;

public class FloatingPointProgram {

	public static void main(String[] args) {

//		float f = 238654289543669999999999999999999999999999.0f; // Erro - The literal
		// 238654289543669999999999999999999999999999f of type
		// float is out of range

		double d = 238654289543669999999999999999999999999999.0;
		System.out.println(d);

		System.out.println("-------");

		float f1 = 1 / 3; // result - 0.0 (1 and 3 are int so it calculates and gives result in int and
							// type cast it to floating value so 0.0)
		float f2 = 1 / 3f; // result - 0.33333334
		float f3 = (float) (1.0 / 3);
		float f4 = (float) (1.0 / 3.0);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println("-------");

		double d1 = 1 / 3; // result - 0.0 (1 and 3 are int so it calculates and gives result in int and
		// type cast it to floating value so 0.0)
		double d2 = 1 / 3f;
		double d3 = 1.0 / 3;
		double d4 = 1 / 3.0;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
	}
}
