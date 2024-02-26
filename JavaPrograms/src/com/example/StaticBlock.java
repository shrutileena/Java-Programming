package com.example;

public class StaticBlock {

	public static void main(String[] args) {
		Hello2.print();
		
		Hello2 hello2 = new Hello2(12);
		hello2.printAll();
		
		Hello2 hello3 = new Hello2(24);
		hello3.printAll();
	}

}

class Hello2 {

	static String name;
	int id;
	
	// static block is initializing name for all objects
	// since name is static variable, it is common for all objects
	// so, we are initializing it once only and not in constructor each time
	// static block is called only once
	// static block is called first always
	// whenever class is loaded, static block is called
	// class is loaded first and once, so static block is also called
	static {
		name = "Hello";
		System.out.println("in static block");
		System.out.println("static block is called only once");
	}
	
	Hello2(int id){
		this.id = id;
		System.out.println("in constructor");
	}
	
	public static void print() {
		System.out.println("print");
		System.out.println(name);
	}
	
	public void printAll() {
		System.out.println(this.id);
		System.out.println(name);
	}
}