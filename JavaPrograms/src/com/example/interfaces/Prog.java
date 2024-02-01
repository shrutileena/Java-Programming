package com.example.interfaces;

interface MyInterface {

	void hello();

	int hello1();
	
	static int hello2() {
		return 2;
	}
	
	default int hello3() {
		return 3;
	}
}

// abstract class can implement interface and cannot give implementation of interface methods
abstract class Demo implements MyInterface {

}

// gives implementation of interface methods; it extends abstract class
public class Prog extends Demo {

	public static void main(String[] args) {
		Prog p = new Prog();
		p.hello();
		System.out.println(p.hello1());
		
		System.out.println(MyInterface.hello2());
		
		System.out.println(p.hello3());
		
	}

	@Override
	public void hello() {
		System.out.println("hello");
	}

	@Override
	public int hello1() {
		return 1;
	}
	
	@Override
	public int hello3() { // default to public
		return super.hello3();
	}
}
