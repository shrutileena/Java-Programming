package com.example.java.core.basicprograms;

import com.example.interfaces.Bicycle;

public class Identifiers {

	int b = 11;
	static int c = 12;
	
	public static void main(String[] args) {
		
		// the variable names are identifiers
		int a = 10;
		int _a = 10;
		int $a = 10;
//		int 9a = 10;	// Syntax error on token "9", delete this token
		int a9 = 10;
//		int a@ = 10;	// Duplicate local variable a - special character is not considered here
		
		System.out.println(a);
		System.out.println(_a);
		System.out.println($a);
		System.out.println(a9);
		System.out.println(new Identifiers().b);
		System.out.println(c);
		
		Bicycle b = new Bicycle();
	}
}
