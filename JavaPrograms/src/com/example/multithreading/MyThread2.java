package com.example.multithreading;

public class MyThread2 extends Thread {

	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
		}
		System.out.println("Thread 2 completed");
	}
	
	public static void main(String[] args) {
		MyThread2 myThread2 = new MyThread2();
		myThread2.start();
	}

}
