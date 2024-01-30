package com.example.inheritence.abstraction;

abstract class Vehicle {

	abstract public void drive();
	
	abstract void abc();

	protected abstract void repair();

	public void xyz() {
		System.out.println("xyz");
	}
	
	// atleast one method is abstract
	// not necessary that all methods are abstract

}
