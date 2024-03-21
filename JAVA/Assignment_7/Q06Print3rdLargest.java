package com.javaArray.main;

//Print the third-largest number in an array without sorting it
public class Q06Print3rdLargest {

	public static void main(String[] args) {
		int[] arr = {24,54,31,16,82,45,67};

		int firstMax = 0;
		int secondMax = 0;
		int thirdMax = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>firstMax) {
			secondMax = firstMax;
			firstMax = arr[i];
			}
			
		else if(arr[i]>secondMax) {
			thirdMax = secondMax;
			secondMax = arr[i];
			}
		
		else if(arr[i]>thirdMax) {
			thirdMax = arr[i];
			}
		}
		System.out.println("Third Max "+thirdMax);
	}
}