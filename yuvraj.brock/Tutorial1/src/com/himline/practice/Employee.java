package com.himline.practice;

import java.util.Iterator;
import java.util.Scanner;

public class Employee {
static Employee [] ArrayofEmployee = new Employee[3];
static String Name ;
String Fathername ;
String Department;
public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	Name = sc.nextLine();
	ArrayofEmployee[0].Fathername = sc.nextLine();
	while(Name != null)
		
	System.out.println("your name is   ;" +Name);
//		while(ArrayofEmployee[0].Fathername != null)
//	System.out.println(ArrayofEmployee[0].Fathername);
}
}

