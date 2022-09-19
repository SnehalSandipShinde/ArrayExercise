package com.prowings.arrays;

import java.util.Arrays;

public class SecondLargeElement {
	public static void secondLarge(){
		int[] arr = {12, 61, 22, 10, 11};
		
		for(int i=0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("Second largest Element in given Array is: "+arr[1]);

	}
	
	public static void main(String[] args) {
		secondLarge();
	}

}
