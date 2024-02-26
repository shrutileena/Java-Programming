package com.example.strings;

public class StringNotes {

	public static void main(String[] args) {
//		String name = "shruti";	// literal - This is created in string pool
		String name = new String("shruti");	// new - this is created in heap area
		
		// objects - String - creates immutable objects
		// memory - If we change value of string using concat() a lot of times -  it will allocate more memory as it creates new literal everytime
		// thread-safe - not thread safe, methods are not synchronized
		// performance- slow
		
		// String Buffer and Builder - allocate memory in heap area
		// creates mutable objects
		// consumes less memory - value is changed in original object only 
		// StringBuffer - all methods are synchromized, hence thread safe; faster than String
		// StringBuilder - methods are not-synchronized, hence not thread safe; faster than StringBuffer as methods are non-synchronized
		
		System.out.println(name);
		System.out.println(name.hashCode());
		System.out.println("hello " + name);
		System.out.println(name.charAt(2));
		System.out.println(name.concat(" agarwal"));
	}

}
