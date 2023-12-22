package com.example.interfaces;

interface API {
	
	default void show() {
		System.out.println("Default API");
	}
}

interface Inteface1 extends API {
	
}

interface Interface2 extends API {
	
}

public class MultipleInheritance implements Inteface1, Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance mi = new MultipleInheritance();
		mi.show();
	}

}
