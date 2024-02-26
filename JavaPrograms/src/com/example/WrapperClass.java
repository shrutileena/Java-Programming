package com.example;

public class WrapperClass {

	public static void main(String[] args) {
		// Java is not 100% Object oriented
		// as it uses primitive dataypes
		// to make it 100% OOP we use primitive datatypes as objects using wrapper classes
		
		// every primitive type has a class	for it
		// for perfomance we use primitive types as they directly deal with fixed memory
		// and not objects in heap memory
		
		int num = 7;
		Integer num1 = 89;
		Integer num2 = num;	// boxing + auto -> autoboxing
		// auto -> automatically converted int to Integer object
		// converting is called boxing
		
		System.out.println(num1);
		System.out.println(num2);
		
		int num3 = num1.intValue();	// unboxing -> Integer (object type) to int (primitive type)
		System.out.println(num3);
		
		int num4 = num1;	// auto-unboxing -> automatic conversion of Integer to int
		System.out.println(num4);

		String str = "19";
		int num5 = Integer.parseInt(str);
		System.out.println(num5 * 2);
	}

}
