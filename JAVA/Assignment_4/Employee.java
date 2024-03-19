package com.example.main;

import java.util.Scanner;

class Employeedetails{
	String name;
	int empid;
	float salary;
	String department;
	
	public void enterDetails(String department, float salary, int empid, String name) {
		this.department = department;
		this.salary = salary;
		this.empid = empid;
		this.name = name;
	}
	
	public void enterDetails(String name, String department, float salary, int empid) {
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.empid = empid;
	}
	
	public void enterDetails(float salary, int empid, String name, String department) {
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.empid = empid;
	}
	
	
	public void printRecord(/* Employee this*/) {

		System.out.println(this.name+"  "+this.empid+"  "+this.salary);
	}
	
}
public class Employee {

	public static void main(String[] args) {
			
		Employeedetails emp1 = new Employeedetails();
			emp1.enterDetails("Mech", 50000, 8588, "Naresh");	//emp1.acceptRecord(emp1);
			emp1.printRecord();		//emp1.printRecord(emp1);
			
			Employeedetails emp2 = new Employeedetails();
			emp2.enterDetails("Mohit", "R&D", 50000, 8598);	//emp1.acceptRecord(emp1);
			emp2.printRecord();		//emp1.printRecord(emp1);
			
			Employeedetails emp3 = new Employeedetails();
			emp3.enterDetails(50000, 8588, "Paras", "Developer");	//emp1.acceptRecord(emp1);
			emp3.printRecord();		//emp1.printRecord(emp1);
			}

}
