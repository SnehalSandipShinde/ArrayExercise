package com.prowings.arrays;

import java.util.Arrays;

public class ConcateArray {
	public static void concatinationArrays() {
		int[] arr = {12, 34,56,67,78};
		int[] arr2 = {32, 11, 22, 33};
		
		int length = arr.length + arr2.length;
		
		int[] result = new int[length];
		int index = 0;
		for(int element : arr) {
			result[index] = element;
			index++;
		}
		for(int element : arr2) {
			result[index] = element;
			index++;
		}
		
		System.out.println(Arrays.toString(result));
	}
	public static void main(String[] args) {
		concatinationArrays();
	}

}
