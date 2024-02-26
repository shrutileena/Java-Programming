package com.example;

class AB {

	AB() {
		System.out.println("inside A");
	}

	AB(int n) {
		System.out.println(n);
	}
}

class B extends AB {

	B() {
		super();
//		super(5); // if we call this then it calls A(int n)
		System.out.println("inside B");
	}
	
	B(int n){
		super(n);
//		this();	// this will call B() which in turn calls super()
		System.out.println(n);
	}
}

public class ThisAndSuperMethod {

	public static void main(String[] args) {

		B b = new B();
		B b2 = new B(2);
		
		// inside constructors first line is super() by default even if we don't mention it
		// super(), this() must be in first line in a constructor
		
		// super() -> calls the constuctor of super class
		// this() -> calls the constructor of current object
		
		// to call parameterized constuctor of parent class -> pass parameters in super
		
		// Every class in java extends Objec class
		// so A's super() is Ovject class
	}

}
