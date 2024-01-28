package com.example.interfaces;

interface Bank {
	void deposit();
	void withdraw();
	void loan();
	void account();
}

abstract class Deposit implements Bank {
	public void deposit() {
		System.out.println("Deposit");
	}
}

abstract class Withdraw extends Deposit {
	public void withdraw() {
		System.out.println("Withdraw");
	}
}

class Dev3 extends Withdraw {

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("loan");
	}

	@Override
	public void account() {
		// TODO Auto-generated method stub
		System.out.println("Account");
	}
	
}

public class BankExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dev3 d = new Dev3();
		d.deposit();
		d.withdraw();
		d.loan();
		d.account();
	}

}
