package com.example.multithreading;

public class Consumer extends Thread {

	Company c;

	public Consumer(Company c) {
		this.c = c;
	}

	@Override
	public void run() {
		while (true) {
			try {
				this.c.consumeItem();
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
