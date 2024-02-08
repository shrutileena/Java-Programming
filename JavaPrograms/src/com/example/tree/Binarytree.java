package com.example.tree;

import java.util.Scanner;

public class Binarytree {

	private class Node {
		int data;
		Node node;
		Node left;
		Node right;

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	Node root = null;
	int size = 0;

	public Binarytree() {
		Scanner sc = new Scanner(System.in);
		this.root = createBinaryTree(sc, null, false);
	}

	private Node createBinaryTree(Scanner sc, Node parent, boolean leftOrRight) {
		if (parent == null) {
			System.out.println("Enter the data for root node - ");
		} else {
			if (leftOrRight) {
				System.out.println("Enter the data for left child - " + parent.data);
			} else {
				System.out.println("Enter the data for right child - " + parent.data);
			}
		}

		// creating node object
		int data = sc.nextInt();
		Node node = new Node(data, null, null);

		this.size++;

		boolean decideLOrR = false;

		System.out.println("Do you want left child of : " + node.data + " ? ");
		decideLOrR = sc.nextBoolean();

		if (decideLOrR) {
			node.left = createBinaryTree(sc, node, true);
		}

		decideLOrR = false;
		System.out.println("Do you want right child of : " + node.data + " ? ");
		decideLOrR = sc.nextBoolean();

		if (decideLOrR) {
			node.right = createBinaryTree(sc, node, false);
		}

		return node;
	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {
		String res = "";
		if (node.left != null) {
			res += node.left.data + "=>";
		} else {
			res += "END=>";
		}
		res += node.data;

		if (node.right != null) {
			res += "<=" + node.right.data;
		} else {
			res += "<=END";
		}
		
		System.out.println(res);
		if(node.left!=null) {
			this.display(node.left);
		}
		if(node.right!=null) {
			this.display(node.right);
		}
	}
	
	private void preOrder(Node node){
		if(node==null) {
			return;
		}
		System.out.print(node.data+", ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public void preOrder() {
		preOrder(this.root);
	}
	
	private void inOrder(Node node){
		if(node==null) {
			return;
		}
		
		inOrder(node.left);
		System.out.print(node.data+", ");
		inOrder(node.right);
	}

	public void inOrder() {
		inOrder(this.root);
	}
	
	private void postOrder(Node node){
		if(node==null) {
			return;
		}
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data+", ");
	}

	public void postOrder() {
		postOrder(this.root);
	}
}
