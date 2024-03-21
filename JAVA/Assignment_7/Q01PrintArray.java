package com.javaArray.main;

import java.util.Scanner;

public class Q01PrintArray {

	//This program is to print elements of Array
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the elements of Array = ");
		int length = sc.nextInt();
		
		int[] arr = new int[length];
		
		for( int i = 0; i < length; i++ ){
			System.out.print("\n Enter element [ "+i+" ]	:	");
			arr[ i ] = sc.nextInt();
		}
		
		System.out.println("\n Your entered array elements are	:	");
		for( int i = 0; i < length; i++ ){
			System.out.println("arr[ "+i+" ]	:	"+ arr[ i ]);
		}

	}

}
