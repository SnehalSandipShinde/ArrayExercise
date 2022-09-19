package com.prowings.arrays;

import java.util.Arrays;

public class CalculateAverage {

	public static void average() {
		int[] arr = { 10, 20, 75, 40, 50 };
		int sum = 0;
		System.out.println("Given Array: "+Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println("Addition of array elements: "+sum);
		int avg = sum / arr.length;
		System.out.println("Average of array elements: " + avg);
	}

	public static void main(String[] args) {
		average();
	}
}
