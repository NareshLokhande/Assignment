package com.assignment3;

public class Q4 {

	public static void main(String[] args) {
		
		//Program that demonstrates widening conversion from int to (double,float, boolean, string) and prints the result
		
		int a = 10;
		double b = a;
		float c = a;
		String str = Integer.toString(a);
		
		System.out.println("Converted values of integer into " + "\nDouble = " + b + "\nFloat = " + c + "\nString = " +str);

	}

}
