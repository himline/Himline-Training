package com.himline.assesment;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Employeesearch {

	public static void main(String[] args) {
	
		Employeebase[] Arraylist = new Employeebase[10];
		for (int i = 1; i < Arraylist.length; i++) {
		
			Employeebase eb = new Employeebase();
			//HashSet<String> SET = new HashSet<String>();
			System.out.println("ENTER NAME 1:");
			Scanner sc = new Scanner(System.in);
			eb.Employeename = sc.nextLine();
			//SET.add(eb.Employeename);

			 
			System.out.println("ENTER NAME 2:");
			
			eb.Employeename = sc.nextLine();
		//	SET.add(eb.Employeename);
			System.out.println(eb.getEmployeename());
			if (eb.Employeename == null) {
				System.out.println("error");
			}

			System.out.println("enter your search ");
			for (Employeebase arr : Arraylist) {
				for (int j = 1; j < Arraylist.length; j++) {
					eb.search = sc.nextLine();
					Arraylist.equals(arr);

					System.out.println(eb.search);
					//if (eb.Employeename.equalsIgnoreCase(eb.search)) {
				//	if(SET.contains(eb.search)){
						System.out.println("yes");
				//	} else {
						System.out.println("no");
					}
				}
			}
		}
	//}

	private static Object Employeebase(String search) {
		return null;
	}

}
