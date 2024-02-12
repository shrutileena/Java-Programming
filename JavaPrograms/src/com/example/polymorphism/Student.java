package com.example.polymorphism;

public class Student {

	// overloading
	public void read() {
		System.out.println("Reading XYZ book");
	}
	
	public void read(String name) {
		System.out.println("Reading " + name + " book");
	}
}
