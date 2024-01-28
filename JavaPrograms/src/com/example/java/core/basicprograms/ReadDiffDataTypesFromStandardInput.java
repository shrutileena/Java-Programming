package com.example.java.core.basicprograms;

import java.util.Scanner;

public class ReadDiffDataTypesFromStandardInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter byte");
		byte b = scanner.nextByte();
		System.out.println("Entered byte: "+b);
		
		System.out.println("Enter short");
		short s = scanner.nextShort();
		System.out.println("Entered short: "+s);
		
		System.out.println("Enter long");
		long l = scanner.nextLong();
		System.out.println("Entered long: "+l);
		
//		System.out.println("Enter short");
//		short s = scanner.nextShort();
//		
//		System.out.println("Entered short: "+s);
		
		scanner.close();
		
	}

}
