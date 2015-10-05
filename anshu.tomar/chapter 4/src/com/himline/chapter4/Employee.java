package com.himline.chapter4;

public class Employee {

	int salary;
	public static void main(String args[])
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		 
		e1.salary = 10000;
		e2.salary = 2000;
		
		System.out.println("salary of e1 starting rs" +e1.salary);
		System.out.println("salary of e2 starting rs" +e2.salary);
		
		e2.salary = 6000;
		System.out.println("salary of e1 starting rs" +e1.salary);
		System.out.println("salary of e1 starting rs" +e2.salary);
	}
}
