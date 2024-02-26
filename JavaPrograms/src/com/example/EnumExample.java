package com.example;

enum Laptop1 {
	Macbook(2000), XPS(2200), Surface, ThinkPad(1800);

	private int price;

	// constructor
	private Laptop1(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// default constructor
	private Laptop1() {
		price = 5000;	// default value
	}
	
}

public class EnumExample {

	public static void main(String[] args) {
		
		Laptop1 lap = Laptop1.Macbook;
		System.out.println(lap);
		System.out.println(lap.getPrice());
		
		for(Laptop1 l: Laptop1.values()) {
			System.out.println(l + "->" + l.getPrice());
		}
	}

}
