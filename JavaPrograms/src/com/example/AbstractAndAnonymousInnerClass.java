package com.example;

abstract class Abst {

	public abstract void show();

	public abstract void config();
}

public class AbstractAndAnonymousInnerClass {

	public static void main(String[] args) {

		Abst a = new Abst() {

			@Override
			public void show() {
				System.out.println("show");
			}

			@Override
			public void config() {
				System.out.println("config");
			}
		}; // this is the object of anonymous inner class and not abstract class
			// used when we want it only once

		a.show();
		a.config();
	}

}
