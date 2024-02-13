package com.example.memorymanagement;

public class GCDemo {

	GCDemo gcDemo3;
	
	public static void main(String[] args) {
		GCDemo gcDemo = new GCDemo();
		GCDemo gcDemo1 = new GCDemo();
//		gcDemo = null;	// eligible 
//		gcDemo = gcDemo1;	// eligible
		
		// island of isolation
		gcDemo.gcDemo3 = gcDemo1;	
		gcDemo1.gcDemo3 = gcDemo;
		
		gcDemo = null;	// eligible
		gcDemo1 = null;	// eligible
		
//		System.gc();
		Runtime.getRuntime().gc();
		System.out.println("Main method is done");
	}
	
	// this method is in Object class
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method is called");
	}

}
