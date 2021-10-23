package com.generics.maxnumber;

public class MaximumNumber {
	
	public static void main(String[] args) {
		
		Integer num1 = 678, num2 = 74, num3 = 702, max;   //declaring 3 numbers of Integer type
		max = num1;										   //assigning first number to max
		if(num2.compareTo(max) > 0) {			           //comparing second number with max and if greater assigning it to max
			max = num2;
		}
		else if(num3.compareTo(max) > 0){
			max = num3;
		}
		System.out.println("Maximum number is " + max);		//printing max of all three Integer
	}
}