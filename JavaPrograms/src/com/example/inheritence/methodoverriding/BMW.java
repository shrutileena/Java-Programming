package com.example.inheritence.methodoverriding;

public class BMW extends Car {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("I am driving BMW");
	}
	
	// not overridden as it is private
	private void print() {
		System.out.println("Hello");
	}
	
	// Cannot reduce the visibility of the inherited method from Car
//	private void write() {
//		System.out.println("wr");
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// method overriding - dynamic polymorphism
		
		BMW b = new BMW();
		b.drive();
		
		Car c = new Car();
		c.drive();
		
		Car c2 = new BMW();
		c2.drive();
		
		b.print();
		//c.print();	// cannot use private method in other class
	}

}
