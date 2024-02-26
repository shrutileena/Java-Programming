package com.example;

public class StaticMethods {

	public static void main(String[] args) {
		// we can use only static variables inside static method
		// other variables can be used if reference object is passed as an argument

		// why main is static?
		// because if main was not static, then we would need obejct of the call to call
		// main method. But main is the starting point of execution. Who will create
		// that object
		// So main is static method
		
		// why non static variables are not used in static method
		// because method will be confused that the variable is of which object
		// since static variables are common to all objects, but instance variables
		// are not common. So, to prevent this ambiguity it does not accept instance variables
		// or non static variables

		hello();
		
		Hello.print();
	}

	public static void hello() {
		System.out.println("hello");
	}
}

class Hello {

	public static void print() {
		System.out.println("print");
	}
}
