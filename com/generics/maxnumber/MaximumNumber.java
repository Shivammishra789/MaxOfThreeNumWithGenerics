package com.generics.maxnumber;

public class MaximumNumber{

	public static void main(String[] args) {

		Integer[] intArray = {5,7,8,12,89};
		Float[] floatArray = {5.7f,7.4f,8.9f,12.7f,8.9f};
		String[] stringArray = {"Shivam","orange","Goa","carrot","apple"};
		
		findMaximum(intArray); 
		findMaximum(floatArray);
		findMaximum(stringArray);
	}

	public static <E extends Comparable<E>> void findMaximum(E[] array) { 

		E max = array[0]; // assigning first array value to max
		for(int i = 1; i < array.length; i++) {
			if (max.compareTo(array[i]) < 0) { 
				max = array[i];
			}
		}
		printMax(max);  // calling generic printMax method
	}
	public static <E> void printMax(E max) {
		System.out.println("Maximum is " + max); // printing max of all three
	}
}