package com.prowings.arrays;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		asendingSorting();
		System.out.println(" ");
		desendingSorting();
	}

	public static void asendingSorting() {
		int[] arr = { 12, 6, 22, 10, 11, 0 };
		System.out.println("Original Array: " + Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("Asending Array: " + Arrays.toString(arr));

	}

	public static void desendingSorting() {
		int[] arr = { 12, 61, 22, 10, 11 };
		System.out.println("Original Array: " + Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("Desending Array: " + Arrays.toString(arr));

	}

}
