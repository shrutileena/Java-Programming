package com.example.inheritence.abstraction;

public class Car extends Vehicle {

	@Override
	public void drive() {
		System.out.println("It is a car.");
	}
	
	public static void main(String[] args) {
		new Car().drive();
		new Car().xyz();
		new Car().repair();
	}

	@Override
	protected void repair() {
		// TODO Auto-generated method stub
		System.out.println("Car is getting repair");
	}

	@Override
	void abc() {
		System.out.println("abc");
	}
	
}
