package com.example.stack;

class StackExp {
	
	public void m1() {
		System.out.println("m1...");
		m2();
	}
	
	public void m2() {
		System.out.println("m2...");
		m3();
	}
	
	public void m3() {
		System.out.println("m3...");
		m4();
	}
	
	public void m4() {
		System.out.println("m4...");
		m5();
	}
	
	public void m5() {
		System.out.println("m5...");
	}
	
}

public class StackExample {

	public static void main(String[] args) {

		StackExp stackExp = new StackExp();
		stackExp.m1();
		
		// here check jvm compiler and see that 
		// it uses stack functionality to call methods
		// first m1() is pushed to stack , then m2 them m3 then m4 then m5
		// then when slowly slowly after process is executed m5 is poped, then m4
		// then m3 then m2 and then m1
	}

}
