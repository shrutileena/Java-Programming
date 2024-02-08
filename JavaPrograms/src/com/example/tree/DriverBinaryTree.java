package com.example.tree;

public class DriverBinaryTree {

	public static void main(String[] args) {
		Binarytree binarytree = new Binarytree();
		binarytree.display();
		System.out.println("preorder");
		binarytree.preOrder();
		System.out.println();
		System.out.println("inorder");
		binarytree.inOrder();
		System.out.println();
		System.out.println("postorder");
		binarytree.postOrder();
		// 100 true 50 true 20 false false true 30 false false true 60 true 11 false false true 12 false false
	}

}
