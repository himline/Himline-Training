package com.himline.assesment;

import java.util.Arrays;
import java.util.Scanner;

public class Detail {
	static String EmployeeName;
	static String Dateofbirth;
	static String Parentname;
	static String Department;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter employee name ");
		EmployeeName = sc.nextLine();
		// System.out.println("Employee name is " + EmployeeName);

		System.out.println("Please enter employee date of birth ");
		Dateofbirth = sc.nextLine();
		// System.out.println("Employee date of birth is " + Dateofbirth);

		System.out.println("Please enter employee father name ");
		Parentname = sc.nextLine();
		// System.out.println("Employee father name is " + Parentname);

		System.out.println("Please enter employee Department ");
		Department = sc.nextLine();
		// System.out.println("Employee department is " + Department);

		System.out.println("Your entered details are:" + EmployeeName + "   D.O.B " + Dateofbirth + "  Fathername   "
				+ Parentname + " Department  " + Department);

		
		System.out.println("Enter employee unique id : ");	
		
		int num_employees = sc.nextInt();
		Detail[] stu = new Detail[num_employees];
		
		for (Detail s : stu) {
			int count = 1;
			
			System.out.println("Employee " + count + "  Your Name:  " + EmployeeName);
			System.out.println("Employee " + count + "   D.O.B       " + Dateofbirth);
			System.out.println("Employee " + count + "  Fathername   "	+ Parentname );
			System.out.println("Employee " + count + "  Department   " + Department );
			
			
			System.out.println(stu);
			count++;
			sc.nextLine();
			
		
		}
		//Arrays.sort(stu);
		
		
		}

		}
