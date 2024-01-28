package com.example.thread;

public class ThreadRunnable implements Runnable {

	public static void main(String[] args) {
		
		// 1. Runnable Interface - java.lang.Runnable 
		// implement and override method
		ThreadRunnable tr = new ThreadRunnable();
		
		Thread t = new Thread(tr, "tr");
		
		// start() method - java.lang.Thread
		// so we create a thread of Thread and use start() to start out tr thread
		t.start();
		
		System.out.println(t.getName());
		
//		new ThreadRunnable().run();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
}
