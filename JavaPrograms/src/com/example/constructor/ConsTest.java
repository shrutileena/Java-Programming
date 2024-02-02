package com.example.constructor;

public class ConsTest {

	int data = 0;

	{
		System.out.println("This is static block");
	}

	ConsTest() {
		System.out.println("This is default constructor");
	}

	ConsTest(int data) {
		System.out.println("This is parameterized constructor");
	}

	public static void main(String[] args) {

//		ConsTest consTest = new ConsTest();
//
//		ConsTest ct = new ConsTest(24);

		ConsChildTest cct = new ConsChildTest(); // super() is by default called as it is first line in every
						// constructor of any class
						// so, constructors of parent class are called
	}

}

class ConsChildTest extends ConsTest {

	ConsChildTest() {
		// super() hidden in first line (this line) - it is by default called
		System.out.println("This is child class - default constructor");
	}

}
