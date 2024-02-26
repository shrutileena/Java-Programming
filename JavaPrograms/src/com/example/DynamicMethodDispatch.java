package com.example;

class S {

	public void show() {
		System.out.println("inside S");
	}
}

class R extends S {

	public void show() {
		System.out.println("inside R");
	}
}

class T extends S {

	public void show() {
		System.out.println("inside T");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {

		S s = new S();
		s.show();
		
		s = new R(); // Valid -> reference of super class, object of sub class
		s.show();

		s = new T();
		s.show();
		
		// Dynamic Method Dispatch -> run time polymorphism
	}

}
