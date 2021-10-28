package com.generics.maxnumber;

public class MaximumNumber<E extends Comparable<E>> {

	// global variables
	private E firstValue, secondValue, thirdValue;

	public MaximumNumber(E firstValue, E secondValue, E thirdValue) {
		super();
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;

	}

	public static void main(String[] args) {

		MaximumNumber<Integer> maxInt = new MaximumNumber<Integer>(45,78,89);  
		maxInt.findMaximum();
		MaximumNumber<Float> maxFloat = new MaximumNumber<Float>(4.45f,7.98f,7.9f);
		maxFloat.findMaximum();
		MaximumNumber<String> maxString = new MaximumNumber<String>("apple","peach","mango");
		maxString.findMaximum();
	}

	public void findMaximum() { // method to find maximum 

		E max = firstValue; // assigning first number to max
		if (secondValue.compareTo(max) > 0) { // comparing second number with max and if greater assigning it to max
			max = secondValue;
		}
		if (thirdValue.compareTo(max) > 0) {
			max = thirdValue;
		}
		System.out.println("Maximum is " + max); // printing max of all three
	}
}