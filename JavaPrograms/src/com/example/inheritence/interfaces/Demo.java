package com.example.inheritence.interfaces;

interface A {

	// class to class -> extends
	// interface to interface -> extends
	// class to interface -> implements

	void show();

	void config();
}

interface B {
	void run();
}

interface C extends B {

}

public class Demo implements A, C {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.show();
		d.config();
		d.run();
		
	}

	@Override
	public void run() {
		System.out.println("run");
	}

	@Override
	public void show() {
		System.out.println("show");
	}

	@Override
	public void config() {
		System.out.println("config");
	}

}
