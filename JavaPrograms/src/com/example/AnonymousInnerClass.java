package com.example;

class H{
	
	public void show() {
		System.out.println("inside H");
	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		H h = new H();
		h.show();
		
		H h2 = new H() {
			public void show() {
				System.out.println("inside new H");
			}
		};	// Anonymous Inner class -> without class keyword and name
		h2.show();
	}

}
