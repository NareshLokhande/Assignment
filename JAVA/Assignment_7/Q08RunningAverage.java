package com.javaArray.main;
//program which takes an array of integers and prints the running average of 3 consecutive integers.
import java.util.Scanner;

public class Q08RunningAverage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array  : ");
		int size = sc.nextInt();
		System.out.print("Enter the Array : ");
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		if(size>=3) {
			float avg = 0.0f;
			for(int i=0;i<size-2;i++) {
				int sum = arr[i]+arr[i+1]+arr[i+2];
				avg = sum/3;
				System.out.print(avg+" ");
			}
			
		}

	}

}
