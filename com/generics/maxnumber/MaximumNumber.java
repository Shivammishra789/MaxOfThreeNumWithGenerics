package com.generics.maxnumber;

public class MaximumNumber {

	public static void main(String[] args) {
		findMax( 78, 42, 96); // passing three Integer value in method
		findMax(7.2f, 4.2f, 9.6f); // passing three Floating value in method
		findMax("Apple", "Pear", "Banana"); // passing three String value in method
	}
	
	// generic method to get max
	public static <E extends Comparable> void findMax(E num1, E num2, E num3) { // parameterized method to find maximum 
		E max = num1; // assigning first number to max
		if (num2.compareTo(max) > 0) { // comparing second number with max and if greater assigning it to max
			max = num2;
		} else if (num3.compareTo(max) > 0) {
			max = num3;
		}
		System.out.println("Maximum is " + max); // printing max of all three
	}
}