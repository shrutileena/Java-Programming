package com.example.java.core.basicprograms;

public class CompileTimeError {

}

class A {

	void draw(String str) {
	}

}

class B extends A {

	public void draw(String str1, String str2) {
	}

}

class C {

	public static void main(String[] args) {
		A a = new B();
//		a.draw("a", "b"); // The method draw(String) in the type A is not applicable for the arguments
							// (String, String)

	}
}
