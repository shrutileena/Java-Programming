package com.example.stack;

import java.util.Stack;

public class BalancedStringParenthesisChecker {

	public static void main(String[] args) {

		// using Stack class in Java
		
		String str = "{()}}(";
		String str2 = "[{(]})";

		boolean isBal = isBalancedString(str);
		boolean isBal2 = isBalancedString(str2);
		
		System.out.println(isBal);
		System.out.println(isBal2);
	}
	
	public static boolean isBalancedString(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='{') {
				stack.add('}');
			} else if(s.charAt(i)=='(') {
				stack.add(')');
			} else if(s.charAt(i)=='[') {
				stack.add(']');
			} else {
				if(stack.isEmpty()) {
					return false;
				}
				char cc = stack.pop();	// current character
				if(s.charAt(i)!=cc) {
					return false;
				}
			}
		}
		if(stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
