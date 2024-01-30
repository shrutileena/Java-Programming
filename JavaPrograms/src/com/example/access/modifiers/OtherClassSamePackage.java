package com.example.access.modifiers;

public class OtherClassSamePackage {

	public static void main(String[] args) {
		
		PublicModifierMain m = new PublicModifierMain();
		m.print();	// public method is used in same package but different class
		
		PublicModifierSubClass s = new PublicModifierSubClass();
		s.print();	// public method - used in sub class as well
		
//		PrivateModifierMain p = new PrivateModifierMain();
//		p.print();	// The method print() from the type PrivateModifierMain is not visible
		
//		PrivateModifierSubClass p = new PrivateModifierSubClass();
//		p.print();	// The method print() from the type PrivateModifierMain is not visible
		
		ProtectedModifierMain pr = new ProtectedModifierMain();
		pr.print();
		
		ProtectedModifierSubClass prs = new ProtectedModifierSubClass();
		prs.print();
		
		DefaultModifierMain d = new DefaultModifierMain();
		d.print();
		
		DefaultModifierSubClass d1 = new DefaultModifierSubClass();
		d1.print();
	}
}
