package com.javaArray.main;
import java.util.Scanner;

//program which generates the series 1,4,27,16,125,36
public class Q09Series {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements in the series : ");
		int size = sc.nextInt();
		
		for(int i=1;i<=size;i++)
			if(i%2==0)
				System.out.print((int)Math.pow(i, 2)+" ");
			else
				System.out.print((int)Math.pow(i, 3)+" ");
		sc.close();


	}

}
