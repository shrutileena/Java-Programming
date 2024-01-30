package com.example.variables;

class StaticVariable {

	static int b = 2121;

	public void RadhaRadha() {
		System.out.println("b - " + b);
	}

}

public class StaticVariables {

	public static void main(String[] args) {

		StaticVariable sv = new StaticVariable();
		sv.RadhaRadha();

		StaticVariable.b = 2122;

		sv.RadhaRadha();

		StaticVariable sv2 = new StaticVariable();
		sv2.RadhaRadha(); // b value is changed for sv2 object as well prves single copy is created for
							// static variable for multiple objects

	}

}
