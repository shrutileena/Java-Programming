package com.example.inheritence.methodoverloading;

public class Car {
	
	// method overloading - static polymorphism / static binding
	
	public void drive(int speed) {
		System.out.println("Car is driving with speed - " + speed);
	}
	
	public void drive(int speed, int mileage) {
		System.out.println("Car is drivign with speed - " + speed + " and mileage - " + mileage);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1 = new Car();
		c1.drive(50);
		c1.drive(50,400);
	}

}
