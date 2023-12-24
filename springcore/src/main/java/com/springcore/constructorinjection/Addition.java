package com.springcore.constructorinjection;

public class Addition {

	private int a;
	private int b;
	
	public Addition(double a, double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor: double , double");
	}
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Constructor: int , int");
	}
	

	
	public void doSum() {
		System.out.println("Sum is = " + (this.a + this.b));
	}
	
}
