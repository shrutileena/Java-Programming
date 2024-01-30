package com.example.java.core.basicprograms;

public class ByteProgram {

	public static void main(String[] args) {

		byte b = 10;
		System.out.println(b);

//		byte b2 = 130;	// Error - Type mismatch: cannot convert from int to byte ; possible lossy conversion
//		System.out.println(b2);

		byte b3 = 127;
		System.out.println(b3);
		
//		byte b4 = 10.5;	// Error - Type mismatch: cannot convert from double to byte
//		byte b5 = true;	// Type mismatch: cannot convert from boolean to byte
//		byte b6 = "shruti";	// Type mismatch: cannot convert from String to byte
	}
}
