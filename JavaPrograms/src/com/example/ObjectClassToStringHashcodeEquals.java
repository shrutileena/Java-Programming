package com.example;

import java.util.Objects;

class Laptop {

	int price;
	String model;

	@Override
	public String toString() {
		return model + " -> " + price;
	}
	
	public boolean equals(Laptop o) {
		return (this.model.equals(o.model) && (this.price==o.price));	// compares values and check objects are equal or not
	}

	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}
	
}

public class ObjectClassToStringHashcodeEquals {

	public static void main(String[] args) throws InterruptedException {

		Laptop laptop = new Laptop();
		laptop.model = "Lenovo Yoga";
		laptop.price = 100000;
		System.out.println(laptop); // print object com.example.Laptop@626b2d4a
		// by default it calls toString() method
		// so we have to override this method to print data inside the object

		// com.example.Laptop@626b2d4a
		// class name + @ + hashcode (hexadecimal value/ hex string)

		// hashcode - single string of all the data
		// generated using hash function 
		
		Laptop laptop2 = new Laptop();
		laptop2.model = "Lenovo Yoga";
		laptop2.price = 100000;
		System.out.println(laptop2);
		
		boolean result = laptop.equals(laptop2);	// gives false if we don't override equals method
		
		System.out.println(result);
	}
}
