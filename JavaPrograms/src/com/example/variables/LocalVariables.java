package com.example.variables;

public class LocalVariables {

	public static void main(String[] args) {
		
		String s = "Jai Shree Ram"; // local variable - inside main method
		
		System.out.println(s);
		
		// cant use a directly or creating object and using the variable
		// we will have to call the method
	}
	
	public void print() {
		int a = 10; // local variable - inside print method
		System.out.println(a);
	}
}
