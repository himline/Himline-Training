package com.himline.chapter5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class classtrycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner scanner = new Scanner(System.in);
	//	int input = new Integer(args[0]).intValue();  - cast using wrapper string to int 
		Scanner scanner = new Scanner(args[0]);
		
		System.out.print("Enter an integer: ");

		try

		{ 

		int n = scanner.nextInt(); 

		System.out.println("You entered " + n);

		}

		catch (InputMismatchException e)

		{ 

		System.out.println("The input is not an integer");

		}
	}

}
