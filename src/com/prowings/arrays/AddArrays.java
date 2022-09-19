package com.prowings.arrays;

public class AddArrays {
	public static void main(String[] args) {
		
		 additionOfTwoArrays();
		
	}

	public static void additionOfTwoArrays() {
		
		int[] firstArray = {2, 5, 3, 40};
		int[] secondArray = {6, 7, 4, 5};
		int addArray[] = new int[firstArray.length];
		
		for(int i=0; i<firstArray.length; i++) {
			addArray[i] = firstArray[i] + secondArray[i];
		}
		
		for(int i=0; i<addArray.length; i++) {
			System.out.print(" "+addArray[i]);
		}
	}

}
