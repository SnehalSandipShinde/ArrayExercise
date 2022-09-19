package com.prowings.arrays;

import java.util.Arrays;

public class LargestElement {
	public static void largeElement() {
		int[] arr = {12, 34, 22, 90, 7};
		int large = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(large<arr[i]) {
				large = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(large);
		
	}
	public static void main(String[] args) {
		largeElement();
	}

}
