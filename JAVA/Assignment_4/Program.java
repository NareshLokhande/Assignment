package com.example.main;
import java.util.Scanner;

class Student{
	String name;
	int rollno;
	float percentage;
	
	public void acceptRecord(/* Employee this*/) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Name :  ");
		this.name = sc.nextLine();
		System.out.print("Roll No :  ");
		this.rollno = sc.nextInt();
		System.out.print("Percentage :  ");
		this.percentage = sc.nextFloat();
		
		sc.close();
	}
	public void printRecord(/* Employee this*/) {

		System.out.println(this.name+"  "+this.rollno+"  "+this.percentage+ "%");
	}
	
}
public class Program {

	public static void main(String[] args) {
			
			Student one = new Student();
			one.acceptRecord();	//stu.acceptRecord(emp1);
			one.printRecord();		//stu.printRecord(emp1);
			
			
			}

}
