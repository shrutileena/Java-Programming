package com.example.interfaces;

public class Automobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle bicycle = new Bicycle();
		bicycle.changeGear(1);
		bicycle.speedUp(30);
		bicycle.applyBrakes(20);
		
		System.out.println(bicycle.printStates());
	}

}
