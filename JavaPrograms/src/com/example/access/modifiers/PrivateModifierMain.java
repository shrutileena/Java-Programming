package com.example.access.modifiers;

import com.example.access.modifiers.otherpackage.PrivateModifierSubClassTest;

public class PrivateModifierMain {

	public static void main(String[] args) {
		
		PrivateModifierMain p = new PrivateModifierMain();
		p.print();
		
//		PrivateModifierSubClassTest p1 = new PrivateModifierSubClassTest();
//		p1.print();
	}
	
	private void print() {
		System.out.println("Hi");
	}
}
