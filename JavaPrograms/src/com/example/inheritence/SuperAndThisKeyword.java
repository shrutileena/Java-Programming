package com.example.inheritence;

class Animal{
	
	int x = 12;
	
	public Animal() {
		super();	// No parent to meaning this constuctor
		System.out.println(this.x);
	}
	
	public void speak() {
		System.out.println("speaks");
	}
}

class Dog extends Animal{
	int x = 4;
	
	public Dog() {
		System.out.println(this.x);	// refers to current invoked object
		System.out.println(super.x);	//refers to parent class's variable
	}
}

public class SuperAndThisKeyword {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.speak();
	}

}
