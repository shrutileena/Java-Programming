package com.example.stack;

import java.util.Scanner;

class MyNewStack {

	int arr[]; // this will be the stack

	int top;

	public MyNewStack(int len) {
		this.arr = new int[len];
		this.top = -1; // initially value of top is -1
	}

	public int size() {
		return top + 1;
	}

	public void push(int data) {
		if (size() == arr.length) {
			System.out.println("Stack is full");
		}
		top++;
		arr[top] = data;
	}

	public int pop() {
		if (size() == 0) {
			System.out.println("Stack is empty");
		}
		int data = arr[top];
		arr[top] = 0;
		top--;
		return data;
	}

	// get element at top
	public int peek() {
		if (size() == 0) {
			System.out.println("Stack is empty");
			return 1;
		}
		return arr[top];
	}

	public void display() {
		if (size() == 0) {
			System.out.println("Stack is empty");
		}
		for (int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
}

public class StackUsingArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of stack");
		int len = sc.nextInt();

		MyNewStack myNewStack = new MyNewStack(len);

		System.out.println("Peek - ");
		myNewStack.peek();
		System.out.println();

		myNewStack.push(10);
		System.out.println("Pushed 10");

		myNewStack.push(20);
		System.out.println("Pushed 20");

		myNewStack.push(30);
		System.out.println("Pushed 30");
		System.out.println();

		System.out.println("Display - ");
		myNewStack.display();
		System.out.println();

		System.out.println("Size of stack is - ");
		System.out.println(myNewStack.size());
		System.out.println();

		System.out.println("Peek - ");
		System.out.println(myNewStack.peek());
		System.out.println();

		System.out.println("Pop - ");
		System.out.println(myNewStack.pop());
		System.out.println();

		System.out.println("Peek - ");
		System.out.println(myNewStack.peek());
		System.out.println();

		System.out.println("Size of stack is - ");
		System.out.println(myNewStack.size());
		System.out.println();

		System.out.println("Display - ");
		myNewStack.display();
		System.out.println();

		System.out.println("Top - ");
		System.out.println(myNewStack.top);
		System.out.println();

		sc.close();
	}

}
