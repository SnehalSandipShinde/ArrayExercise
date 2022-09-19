package com.prowings.arrays;

import java.util.Arrays;

public class SwappingTwoArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 3, 4, 5, 6 };
		swap(a, b);
	}

	public static int[] swap(int[] ar, int ar1[]) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 3, 4, 5, 6 };
//		int[] c = new int[a.length];

		System.out.println("Array Before swapping:");
		System.out.println("a[]= " + Arrays.toString(a));
		System.out.println("b[]= " + Arrays.toString(b));

		if (a != null && b != null) {
			if (a.length == b.length) {
				for (int i = 0; i < a.length; i++) {
//					c[i] = a[i];
//					a[i] = b[i];
//					b[i] = c[i];

					a[i] = a[i] + b[i];
					b[i] = a[i] - b[i];
					a[i] = a[i] - b[i];
				}
			}

			System.out.println("\nArray After swapping:");
			System.out.println("a[]= " + Arrays.toString(a));

			System.out.println("b[]= " + Arrays.toString(b));

		} else {
			System.out.println("Invalid input");
		}

		return b;

	}

}
