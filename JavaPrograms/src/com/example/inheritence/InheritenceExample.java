package com.example.inheritence;

public class InheritenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AF af = new AF();
		af.a();
	}

}

class F {
	
	public void a() {
		System.out.println("a");
	}
	
	public F() {
		System.out.println("f");
	}
}

class AF extends F {
	
	public AF() {
		System.out.println("af");
	}
}