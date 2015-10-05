package com.himline.practice;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Employee {
	public static String EmployeeName;
	public static String DOB;
	public static String FatherName;
	public static String Department;
	public static String Staff;

	public static void main(String[] args) {
		Employee emp = new Employee();
		Array[] Arr = new Array[2];
		for (int i = 0; i <= Arr.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter your Name");
			EmployeeName = sc.nextLine();
			System.out.println("enter your DOB");
			DOB = sc.nextLine();
			System.out.println("enter your fathers's name ");
			FatherName = sc.nextLine();
			System.out.println("enter your Department ");
			Department = sc.nextLine();
			System.out.println("enter your Staff ");
			Staff = sc.nextLine();
		}
		if(emp.EmployeeName == null){
			System.out.println("error");
		}
		 boolean contains = false;
		 for(int j=0; j < Arr.length; j++){
			 if(Arr[j].equals(EmployeeName)){
				 contains = true;
				 break;
			 }
		 }
			 if(contains){
				 System.out.println("EmployeeName contains " + EmployeeName);
			 }else{
				 System.out.println("EmployeeName does not contain  " + EmployeeName);
			 }
		 }
	}

