package com.example.access.modifiers;

import com.example.access.modifiers.otherpackage.DefaultModifierSubClassTest;

public class DefaultModifierMain {

	public static void main(String[] args) {
		
		DefaultModifierMain d = new DefaultModifierMain();
		d.print();
		
//		DefaultModifierSubClassTest d1 = new DefaultModifierSubClassTest();
//		d1.print();
	}
	
	void print() {
		System.out.println("Hi");
	}
}
