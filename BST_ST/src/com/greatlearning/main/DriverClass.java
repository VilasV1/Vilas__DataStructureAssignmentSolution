package com.greatlearning.main;

import com.greatlearning.service.Node;
import com.greatlearning.service.binarySearchTree;

public class DriverClass {
	public static void main(String[] args) {
		binarySearchTree binary = new binarySearchTree();

		Node tree = new Node(50);
		tree.left = new Node(30);
		tree.right = new Node(60);
		tree.left.left = new Node(10);
		tree.right.left = new Node(55);

		binary.binaryTree(tree);

		binary.display(binary.headNode);
	}

}
