package com.example;

interface W {

	int age = 24;	// by default final and static

	void show();	//by default public and abstract

	void config();
}

class WQ implements W {

	@Override
	public void show() {
		System.out.println("show");
	}
	
	@Override
	public void config() {
		System.out.println("config");
	}
}

public class Interface {

	public static void main(String[] args) {

		// by default methods in interface are public and abstract
		// interface show you designs

		// variables -> by default final and static
		// we must initialize variable as they are final

		// interface don't have their memory in heap
		// object implementing that interfac has space in heap
		
		// in imlements we get methods to override and not variables, so variables are final, static by default
		
		WQ obj = new WQ();
		obj.show();
		obj.config();
		System.out.println(W.age);
	}
}
