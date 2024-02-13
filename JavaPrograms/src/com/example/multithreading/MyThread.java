package com.example.multithreading;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
//				e.printStackTrace();
			}
		}
		System.out.println("Thread completed");
	}
	
	public static void main(String[] args) {
		MyThread myThread = new  MyThread();
		
		Thread t = new Thread(myThread);
		t.start();
		
		// object of another threas
		MyThread2 myThread2 = new MyThread2();
		myThread2.start();
	}

}
