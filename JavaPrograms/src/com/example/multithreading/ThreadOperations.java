package com.example.multithreading;

class UserThread extends Thread {

	@Override
	public void run() {
		System.out.println("This is run method");
	}
}

public class ThreadOperations {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program started");

		int x = 56 + 34;
		System.out.println("Sum is " + x);

		// current thread obj
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("Current running thread is - " + name);

		// setName
		t.setName("myMain");
		name = t.getName();
		System.out.println("Current running thread is - " + name);

		// sleep
//		t.sleep(5000);

		// id
		System.out.println(t.getId());
		
		// start - user defined thread
		UserThread ut = new UserThread();
		ut.start();
		 
		System.out.println("Program ended");
	}

}
