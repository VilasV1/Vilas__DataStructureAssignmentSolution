package com.greatlearning.service;

public class binarySearchTree {
	public Node node;
	public Node prevNode = null;
	public Node headNode = null;

	public void binaryTree(Node root) {

		if (root == null) {
			return;
		}

		binaryTree(root.left);

		Node rightNode = root.right;
		Node leftNode = root.left;

		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;

		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		binaryTree(rightNode);

	}

	public void display(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		display(root.right);
	}

}
