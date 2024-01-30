package com.example.java.core.basicprograms;

public class IntLongProgram {

	public static void main(String[] args) {
//		int i = 1000000000000;	// Error - The literal 1000000000000 of type int is out of range 
//		long l = 1000000000000; // if you write big number without L then error - The literal 1000000000000 of
								// type int is out of range
		long l = 1000000000000L;
		System.out.println(l);
	}
}
