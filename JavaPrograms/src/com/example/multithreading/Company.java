package com.example.multithreading;

public class Company {

	int n;	// item
	boolean buffer = false;
	
	// inter-thread communication
	//	if(buffer) - false - chance of Producer to produce
	//	if(buffer) - true - chance of consumer to consume
	
	//	Synchronization
	synchronized public void productItem(int n) throws InterruptedException {
		if(buffer) {
			wait();
		}
		this.n = n;
		System.out.println("Produced : " + this.n);
		buffer = true;
		notify();
	}

	// Synchronization
	synchronized public int consumeItem() throws InterruptedException {
		if(!buffer) {
			wait();
		}
		System.out.println("Consumed : " + this.n);
		buffer = false;
		notify();
		return n;
	}

}
