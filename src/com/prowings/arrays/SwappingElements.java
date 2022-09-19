package com.prowings.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwappingElements {

	public static void main(String[] args) {
		swap();
	}

	public static void swap() {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 23, 43, 22, 12, 45 };
		System.out.println(Arrays.toString(arr));
		System.out.print("Enter two index for swapping:");
		int index1 = sc.nextInt();
		int index2 = sc.nextInt();

		if (index1 >= 0 && index1 < arr.length && index2 >= 0 && index2 < arr.length) {
//			int temp = arr[index1];
//			arr[index1] = arr[index2];
//			arr[index2] = temp;

			arr[index1] = arr[index1] + arr[index2];
			arr[index2] = arr[index1] - arr[index2];
			arr[index1] = arr[index1] - arr[index2];
			for (int i = 0; i < arr.length; i++) {
				System.out.print(" " + arr[i]);
			}
		} else {
			System.out.println("The index is not present in Array.");
		}

		sc.close();

	}

}
