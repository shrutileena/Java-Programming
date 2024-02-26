package com.example;

class A {

	A() {
		System.out.println("constructor");
		System.out.println("object is created");
	}
}

public class AnonymousObject {

	public static void main(String[] args) {
		// Anonymous object - no reference to it
		// new A(); -> object created

		new A();
		
		// we cannot reuse the anonymous object
		// each tie we will have to create new object to call some function
		// everytime we use new A() -> it creates a new object
	}

}
