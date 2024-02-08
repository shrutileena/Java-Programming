package com.example.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GenericTree {

	private class Node {
		int data;
		ArrayList<Node> children;

		Node(int data) {
			this.data = data;
			this.children = new ArrayList<>();
		}
	}

	Node root;
	int size;

	public GenericTree() {
		Scanner sc = new Scanner(System.in);
		this.root = createGenericTree(sc, null, 0);
	}

	// Scanner, root node, children number
	private Node createGenericTree(Scanner sc, Node parent, int ithChild) {
		if (parent == null) {
			System.out.println("Enter the data for root node - ");
		} else {
			System.out.println("Enter the data for the " + ithChild + " th child of " + parent.data +"- ");
		}
		int data = sc.nextInt();
		Node newNode = new Node(data);

		System.out.println("Enter the number of children for " + newNode.data + " - ");
		int children = sc.nextInt();

		// recursion
		for (int i = 0; i < children; i++) {
			Node child = this.createGenericTree(sc, newNode, i);
			newNode.children.add(child);
		}

		return newNode;
	}
	
	public void display() {
		display(this.root);
	}
	
	private void display(Node node) {
		String res = node.data + " -> ";
		for(int i=0; i<node.children.size(); i++) {
			res += node.children.get(i).data + ", ";
		}
		res+="END";
		System.out.println(res);
		for(int i=0; i<node.children.size(); i++) {
			this.display(node.children.get(i));
		}
	}

}
