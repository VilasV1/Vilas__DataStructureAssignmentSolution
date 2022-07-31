package com.greatlearning.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class DriverClass {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building");
		int n = sc.nextInt();

		ArrayList<Integer> collection = new ArrayList<Integer>(n + 1);

		for (int i = 0; i <= n; i++) {
			collection.add(0);
		}

		LinkedList<Integer> floorNumbers = new LinkedList<Integer>();

		for (int i = 1; i < n + 1; i++) {
			System.out.println("Enter the floor size given on day : " + i);
			int m = sc.nextInt();
			collection.set(m, i);
		}

		floorNumbers.addAll(collection);

		int j = n;
		boolean flag;
		System.out.println("The order of construction is as follows ");
		System.out.println();
		for (int i = 1; i <= n; i++) {
			flag = false;
			System.out.println("Day: " + i);
			while (j >= 1 && floorNumbers.get(j) <= i) {
				flag = true;
				System.out.print(j + " ");
				j--;
			}
			if (flag == true) {
				System.out.println();

			} else {
				System.out.println();
			}
		}
	}

}
