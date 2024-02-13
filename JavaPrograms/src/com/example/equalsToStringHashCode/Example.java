package com.example.equalsToStringHashCode;

import java.util.Objects;

public class Example {

	public static void main(String[] args) {
		Laptop obj1 = new Laptop();
		obj1.model = "Lenovo";
		obj1.price = 120000;

		Laptop obj2 = new Laptop();	// created in different memory location
		obj2.model = "Lenovo";
		obj2.price = 120000;

		System.out.println(obj1);
		System.out.println(obj2);

		System.out.println("Shallow Comparizon");
		System.out.println(obj1 == obj2);	// memory comparizon
		System.out.println("Deep Comparison");
		System.out.println(obj1.equals(obj2));	// compare internal details like value	
	}

}

class Laptop {
	String model;
	int price;

	@Override
	public String toString() {
		return "model=" + model + ", price=" + price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)	// if object is same as current object
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(model, other.model) && price == other.price; // compares two objects
	}

//	public boolean equals(Laptop that) {
//		return (this.model.equals(that.model) && this.price == that.price);
//	}

}
