package com.example.inheritence;

public class InheritenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AF1 af = new AF1();
		af.a();
	}

}

class F {
	
	public void a() {
		System.out.println("a");
	}
	
	public F() {
		System.out.println("buffer");
	}
}

class AF extends F1 {
	
	public AF() {
		System.out.println("af");
	}
}