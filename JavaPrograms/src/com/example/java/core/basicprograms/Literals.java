package com.example.java.core.basicprograms;

public class Literals {

	public static void main(String[] args) {
		
		// integer literals - whole numbers + different number bases
		int decimal = 123;	// 123 is a literal
		int binary = 0b1010;	// 0b1010 is a literal
		int octal = 075;
		int hexadecimal = 0x1A;
		
		// boolean literals
		boolean isRaining = false;
		boolean hasCoffee = true;
		
		// character and string literals
		char ch = 'a';
		String str = "string";
		
		// null literal
		String name = null;
		
		// escape sequences
		char singleQuote = '\'';
		String doubleQuote = "\"";
		
		System.out.println(decimal);
		System.out.println(binary);
		System.out.println(octal);
		System.out.println(hexadecimal);
		
		System.out.println(isRaining);
		System.out.println(hasCoffee);
		
		System.out.println(ch);
		System.out.println(str);
		
		System.out.println(name);
		
		System.out.println(singleQuote);
		System.out.println(doubleQuote);
	}
}
