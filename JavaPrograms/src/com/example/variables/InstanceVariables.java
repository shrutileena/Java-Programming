package com.example.variables;

class InstanceVariable {

	int a = 10; // instance variable

	public void RadhaRadha() {
		System.out.println("Jai Shri krishna ...");
		System.out.println(a);
	}

}

public class InstanceVariables {

	public static void main(String[] args) {

		InstanceVariable iv = new InstanceVariable(); // object is created - instance variable is created in heap memory
		iv.RadhaRadha();
		iv.a = 20;
		iv.RadhaRadha();

		InstanceVariable iv2 = new InstanceVariable(); // separate copy of instance variable is created for this object
		iv2.RadhaRadha();

		iv.RadhaRadha(); // value of instance variable of iv object is changed not affecting iv2 'a'
							// value that proves its a separate copy
	}
}
