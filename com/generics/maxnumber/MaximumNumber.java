package com.generics.maxnumber;

public class MaximumNumber {

	public static void main(String[] args) {
		findMax(78, 42, 96);				//passing three Integer value in method
		findMax(7.2f, 4.2f, 9.6f);			//passing three Floating value in method
	}
	public static void findMax( Integer num1, Integer num2, Integer num3) {			//parameterized method to find maximum of three Integer number
		Integer max = num1;														    //assigning first number to max
		if(num2.compareTo(max) > 0) {			                                    //comparing second number with max and if greater assigning it to max
			max = num2;
		}
		else if(num3.compareTo(max) > 0){
			max = num3;
		}
		System.out.println("Maximum Integer number is " + max);		                //printing max of all three Integer
	}
	public static void findMax( Float num1, Float num2, Float num3) {				//parameterized method to find maximum of three Floating number
		Float max = num1;								 
		if(num2.compareTo(max) > 0) {			         
			max = num2;
		}
		else if(num3.compareTo(max) > 0){
			max = num3;
		}
		System.out.println("Maximum Floating number is " + max);		
	}
}