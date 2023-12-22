package com.example.interfaces;

public class Bicycle implements Vehicle {
	
	int speed;
	int gear;
	
	@Override
	public void changeGear(int a) {
		// TODO Auto-generated method stub
		gear = a;
	}

	@Override
	public void speedUp(int a) {
		// TODO Auto-generated method stub
		speed = speed + a;
	}

	@Override
	public void applyBrakes(int a) {
		// TODO Auto-generated method stub
		speed = speed - a;
	}
	
	public String printStates() {
		return "speed: " + speed + ", gear: " + gear;
	}

}
