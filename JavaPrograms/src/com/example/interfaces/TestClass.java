package com.example.interfaces;

interface In1{
	
	final int a = 10;
	
	void display();
	
}

public class TestClass implements In1 {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("StaticClass");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass tc = new TestClass();
		tc.display();
		System.out.println(tc.a);
	}

}
