package com.example.linkedlist;

public class LinkedList {

	// Node Structure
	static class Node {

		int data; // data

		Node next; // address

		public Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	Node head;

	public void insertNode(int data) {
		Node node = new Node(data); // creating new node
		if (this.head == null) {
			// add first node
			this.head = node;
		} else {
			// add in last
			Node temp = this.head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			node.next = null;
		}
	}

	public void insertNodeInStart(int data) {
		Node node = new Node(data);
		if (this.head == null) {
			this.head = node;
		} else {
			node.next = this.head;
			this.head = node;
		}
	}

	public void insertNodeInMiddle(int data, int left) {
		Node node = new Node(data);
		Node temp = this.head;
		while (temp.data != left) {
			temp = temp.next;
		}
		if (temp.data == left) {
			node.next = temp.next;
			temp.next = node;
		}
	}

	public void deleteFirstNode() {
		// delete first node
		Node temp = this.head;
		this.head = temp.next;
	}

	public void deleteLastNode() {
		Node temp = this.head;
		Node prev = null;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = null;
	}

	public void deleteNodeInMiddle(int data) {
		Node temp = this.head;
		Node prev = null;
		while (temp.data != data) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
	}

	public void printLinkedList() {
		Node temp = this.head;
		while (temp != null) {
			System.out.println(temp.data);
//			System.out.println("Node Address - " + temp);	// printing address
			temp = temp.next;
		}
	}

	public int length() {
		int count = 0;
		if (this.head == null) {
			return 0;
		} else {
			Node temp = this.head;
			while (temp.next != null) {
				count++;
				temp=temp.next;
			}
		}

		return count+1;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertNode(10);
		list.insertNode(20);
		list.insertNode(30);
		list.insertNode(40);

		list.printLinkedList();

		System.out.println("delete first node");
		list.deleteFirstNode();

		list.printLinkedList();

		System.out.println("insert node in middle");
		list.insertNodeInMiddle(25, 20);

		list.printLinkedList();

		System.out.println("insert node in starting");
		list.insertNodeInStart(10);

		list.printLinkedList();

		System.out.println("delete last node");
		list.deleteLastNode();
		list.printLinkedList();

		System.out.println("delete node in middle");
		list.deleteNodeInMiddle(25);
		list.printLinkedList();
		
		System.out.println("size of linked list");
		System.out.println(list.length());
	}

}
