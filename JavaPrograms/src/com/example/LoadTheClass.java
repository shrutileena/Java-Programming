package com.example;

class Mobile {

	int id;

	static {
		System.out.println("inside static block");
	}

	public Mobile() {
		this.id = 12;
	}

	public void print() {
		System.out.println(this.id);
	}
}

public class LoadTheClass {

	public static void main(String[] args) throws ClassNotFoundException {

		// Class class
		// forName() - loads the class
		Class.forName("com.example.Mobile");
	}

}