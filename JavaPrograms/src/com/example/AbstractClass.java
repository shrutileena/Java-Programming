package com.example;

abstract class Car {

	public abstract void drive();

	public abstract void fly();

	public void playMusic() {
		System.out.println("Playing Music...");
	}

	// not compulsory to have abstract method in abstract class
}

abstract class WagonR extends Car {

	@Override
	public void drive() {
		System.out.println("Driving...");
	}

	// subclass extending abstract class must implement abstract method
}

class UpdatedWagonR extends WagonR {

	@Override
	public void fly() {
		System.out.println("Flying...");
	}

}

public class AbstractClass {	// concrete class -> which gives implementation of all methods

	public static void main(String[] args) {

//		Car car = new Car();	// cannot instantiate an abstract class

//		WagonR wagonR = new WagonR();
//		wagonR.playMusic();
//		wagonR.drive();
		
		UpdatedWagonR uw = new UpdatedWagonR();
		uw.drive();
		uw.fly();
		uw.playMusic();
	}

}
