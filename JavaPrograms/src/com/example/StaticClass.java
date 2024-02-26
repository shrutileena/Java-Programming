package com.example;

public class StaticClass {

	public static class Agarwal{
		
		public static String name = "StaticClass";
		public void print(){
			System.out.println("Hello");
		}
	}
	
	public static void main(String[] args) {
		new Agarwal().print();
		
		System.out.println(Agarwal.name);
		System.out.println(new Agarwal().name);
		
	}
}
