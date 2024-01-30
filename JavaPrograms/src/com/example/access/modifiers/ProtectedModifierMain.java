package com.example.access.modifiers;

import com.example.access.modifiers.otherpackage.ProtectedModifierSubClassTest;

public class ProtectedModifierMain {

	public static void main(String[] args) {
		ProtectedModifierMain p = new ProtectedModifierMain();
		p.print();
		
		ProtectedModifierSubClassTest p1 = new ProtectedModifierSubClassTest();
		p1.print(); // ProtectedModifierSubClassTest is subclass in other package
	}
	
	protected void print() {
		System.out.println("Hello hi");
	}
}
