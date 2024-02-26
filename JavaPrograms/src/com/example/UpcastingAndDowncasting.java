package com.example;

class K {

	public void show1() {
		System.out.println("inside K");
	}
}

class F extends K {

	public void show2() {
		System.out.println("inside F");
	}
}

public class UpcastingAndDowncasting {

	public static void main(String[] args) {

		K k = new K();
		k.show1();
		
		K k2 = (K) new F();	// upcasting -> casting sub class to super class
		k2.show1();
		
		F f = (F) k2;	// downcasting -> casting super class to sub class
		f.show2();
	}

}
