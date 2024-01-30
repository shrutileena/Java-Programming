package com.example.access.modifiers;

import com.example.access.modifiers.otherpackage.PublicModifierSubClassTest;

public class PublicModifierMain {

	public static void main(String[] args) {
		PublicModifierMain m = new PublicModifierMain();
		m.print();	// public method is used in same class
		
		PublicModifierSubClassTest m1 = new PublicModifierSubClassTest();
		m1.print();
	}
	
	public void print() {
		System.out.println("Hello");
	}
}
