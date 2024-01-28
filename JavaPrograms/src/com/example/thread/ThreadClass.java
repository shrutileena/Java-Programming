package com.example.thread;

public class ThreadClass extends Thread {
	
	
	public static void main(String[] args) {
		
		ThreadClass tc = new ThreadClass();
		tc.start();
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello");

		try {
			sleep(5000);
			System.out.println("Hi");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
