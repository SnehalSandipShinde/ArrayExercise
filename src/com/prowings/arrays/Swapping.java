package com.prowings.arrays;

public class Swapping {

	public static void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping:\na=" + a + "\nb=" + b);
	}

	public static int swapUsingThirdElement(int a, int b) {
		int c = a;
		a = b;
		b = c;
		System.out.println("After Swapping using third element:\na=" + a + "\nb=" + b);
		return 0;
	}

	public static void main(String[] args) {
		int a = 20;
		int b = 30;

		System.out.println("Before Swapping:\na=" + a + " \nb=" + b);
		swap(a, b);
		swapUsingThirdElement(a, b);
	}

}
