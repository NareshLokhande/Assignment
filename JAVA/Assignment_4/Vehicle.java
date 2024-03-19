package com.example.main;

import java.util.Scanner;

public class Vehicle {

	String regNo;
	String modelNo;
	String mfg;
	
	static Scanner sc = new Scanner(System.in);
	
public void enterDetails() {
		
		
		System.out.print("Enter the Registeration Number : ");
		this.regNo = sc.next();
		
		System.out.print("Enter the Model Number : ");
		this.modelNo = sc.next();
		
		System.out.print("Enter the Manufacturer : ");
		this.mfg = sc.next();
		
	}
	
	public void enterDetails(String name1) {
		
		this.regNo = name1;
	
		System.out.print("Enter the Model Number : ");
		this.modelNo = sc.next();
		
		System.out.print("Enter the Manufacturer : ");
		this.mfg = sc.next();
		
	}
	
	public void enterDetails(String name1, String name2) {
		
		this.regNo = name1;

		this.modelNo = name2;
		
		System.out.print("Enter the Manufacturer : ");
		this.mfg = sc.next();
		
	}
	
	public void enterDetails(String num, String name1, String name2) {
		
		this.regNo = num;
		this.modelNo = name1;
		this.mfg = name2;
		
	
	}
	
	public void showDetails() {
		
		System.out.println("---------------------------------------------------------------");


		System.out.println("The Registeration Number is : "+this.regNo);
		
		System.out.println("The Model Number is : "+this.modelNo);
		
		System.out.println("The Manufacturer is : "+this.mfg);
		
		System.out.println("---------------------------------------------------------------");


	}
	
	public static void main(String[] args) {

		
		Vehicle one = new Vehicle();
		Vehicle two = new Vehicle();
		Vehicle three = new Vehicle();
		Vehicle four = new Vehicle();
		
		one.enterDetails();
		one.showDetails();
		
		two.enterDetails("MV08781");
		two.showDetails();
		
		three.enterDetails("BDJ36794","BSJJ3499");
		three.showDetails();
		
		four.enterDetails("SHDK2739","BSJ37902","MARUTI");
		four.showDetails();
	}

}