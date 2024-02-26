package com.example.strings;

public class ImmutableString {

	public static void main(String[] args) {
		String name = "shruti";	// stored at address 101
		String name2 = "shruti";	// stored at address 101
		// name, name2 are pointing to same shruti in String Pool
		// another "shruti" object is not created
		// we save memory like this
		
		System.out.println(name == name2);	// it gives true because reference is same
		
		name = name + " agarwal";
		System.out.println(name);	// "shruti agarwal" is stored at address 102 and name is pointing to this now
		// in String Pool - 
		// shruti is different. It didn't overwrite.
		// shruti agarwal is different
		
		// we are not changing the existing string
		// String pool is String constant pool
	}

}
