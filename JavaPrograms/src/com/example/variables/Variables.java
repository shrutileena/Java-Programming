package com.example.variables;

public class Variables {

	int a = 10;	// instance variable
	
	static int b = 1212; // static variable or class variable
	
	public void print() {
		System.out.println("value of a is " + a);
		System.out.println("value of b is " + b);
	}
	
	public static void RadhaRadha() {
		System.out.println("value of b is " +  b); // b is accessible a is not
//		System.out.println(a);	// Cannot make a static reference to the non-static field a
	}
	
	public static void main(String[] args) {
		
		int c = 11;	// local variable - inside method
		System.out.println("value of c is " + c);
		System.out.println("value of a is " + new Variables().a);
		System.out.println("value of b is " + Variables.b);
		
		Variables.RadhaRadha();
		new Variables().print();
	}
}
