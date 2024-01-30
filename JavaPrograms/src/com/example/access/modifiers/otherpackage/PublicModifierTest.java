package com.example.access.modifiers.otherpackage;

import com.example.access.modifiers.PublicModifierMain;
import com.example.access.modifiers.PublicModifierSubClass;

public class PublicModifierTest {

	public static void main(String[] args) {
		
		PublicModifierMain m = new PublicModifierMain();
		m.print();	// public method is used in different package
		
		PublicModifierSubClass ms = new PublicModifierSubClass();
		ms.print();
	}
}
