package com.generics.maxnumber;

public class MaximumNumber{

	public static void main(String[] args) {

		Integer[] intArray = {5,7,8,12,89};
		findMaximum(intArray); // passing integer array to method
		Float[] floatArray = {5.7f,7.4f,8.9f,12.7f,8.9f};
		findMaximum(floatArray);
		String[] stringArray = {"Shivam","orange","Goa","carrot","apple"};
		findMaximum(stringArray);
	}

	public static <E extends Comparable<E>> void findMaximum(E[] array) { // passing generic array to method

		E max = array[0]; // assigning first array value to max
		for(int i = 1; i < array.length; i++) {
			if (max.compareTo(array[i]) < 0) { // comparing second number with max and if greater assigning it to max
				max = array[i];
			}
		}
		System.out.println("Maximum is " + max); // printing max of all three
	}
}