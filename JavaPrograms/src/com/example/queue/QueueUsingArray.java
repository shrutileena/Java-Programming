package com.example.queue;

import java.util.Scanner;

class MyQueue {
	int front;
	int rear;
	int maxSize;
	int currSize;
	int queue[];

	public MyQueue(int size) {
		maxSize = size;
		queue = new int[size];
		front = 0;
		rear = -1;
	}

	public boolean isFull() {
		return currSize == maxSize;
	}

	public int size() {
		return currSize;
	}

	public boolean isEmpty() {
		return currSize == 0;
	}

	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is full, cannot enqueue.");
			return;
		}
		rear++;
		queue[rear] = data;
		System.out.println(data + " Data added to the queue.");
		currSize++;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty, cannot dequeue.");
			front = 0;
			rear = -1;
			return -1;
		}
		int data = queue[front];
		System.out.println(data + " Data removed from queue.");
		front++;
		currSize--;
		return data;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty, cannot peek.");
			return -1;
		}
		return queue[front];
	}
}

public class QueueUsingArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of queue - ");
		int size = sc.nextInt();

		MyQueue myQueue = new MyQueue(size);
		myQueue.enqueue(10);
		myQueue.enqueue(20);
		myQueue.enqueue(30);
		myQueue.enqueue(40);
		myQueue.enqueue(50);

		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();

		myQueue.enqueue(10);
		myQueue.enqueue(20);

		System.out.println(myQueue.peek());
		System.out.println(myQueue.size());

		sc.close();
	}

}
