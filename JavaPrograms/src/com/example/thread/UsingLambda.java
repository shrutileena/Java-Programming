package com.example.thread;

public class UsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// lambda expression
		new Thread(()->{
			System.out.println("Hello");
		}).start();
		
		
		
		// Anonymous class
		Runnable c = new Runnable(){
			@Override
			public void run() {
				System.out.println("Hi");
			}
		};
		
		Thread th1 = new Thread(c);
		th1.start();
		
		// lambda
		Runnable r = ()->{
				System.out.println("Hi");
		};
		
		Thread th2 = new Thread(r);
		th2.start();
	}

}
