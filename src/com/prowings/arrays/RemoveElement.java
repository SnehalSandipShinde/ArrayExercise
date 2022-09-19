package com.prowings.arrays;

import java.util.Scanner;

public class RemoveElement {

	public static void deleteElement() {
		int[] arr = { 23, 40, 12, 45 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element which you want to delete: ");
		int deletedNumber = sc.nextInt();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (deletedNumber == arr[i]) {

				for (int j = i; j < arr.length - 1; j++) {
					arr[j] = arr[j + 1];
				}
				count++;

			}
		}

		if (count != 0) {
			for (int i = 0; i < arr.length - 1; i++) {
				System.out.print(" " + arr[i]);
			}

			System.out.println();
			System.out.println("Element deleted succesfully....");

		} else {
			System.out.println("element not found");
		}
		sc.close();
	}

	public static void main(String args[]) {
		deleteElement();
	}

}
