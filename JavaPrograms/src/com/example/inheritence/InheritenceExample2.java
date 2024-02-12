package com.example.inheritence;

public class InheritenceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AF af = new AF();
		af.a();
	}

}

class F1 {
	
	public void a() {
		System.out.println("a");
	}
	
	public F1() {
		System.out.println("f");
	}
}

class AF1 extends F {
	
	public AF1() {
//		this();	// Recursive constructor invocation AF1()
		super();	// Constructor call must be the first statement in a constructor
		System.out.println("af");
	}
}