package com.example;

import com.example.G.H;

class G {

	int age;

	public void show() {
		System.out.println("show");
	}

	class H {
		public void config() {
			System.out.println("In config");
		}
	}
	
	static class J {
		public void show() {
			System.out.println("Inside J");
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		// Inner class -> class inside a class
		// this class is only needed for upper class, no other need for it

		G g = new G();
		g.show();
		
		G.H h = g.new H();	// we use object of G to create object of H; type is G.H
							// here object is needed at H is not static, so we use g object
		h.config();
		
		G.J j = new G.J();	// for static inner class we don't need object g
		j.show();
	}

}
