package com.himline.IOstream;

import java.util.Scanner;

public class KeyBoard {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		// reads a whole line
		System.out.println("Enter your name:");
		String s1 = scan.nextLine();
		System.out.println("Your name is " + s1);
	
			// reading an integer
		System.out.println("Enter whole number:");
		int x = scan.nextInt();
		// reading a double
		System.out.println("Enter double value:");
		double y = scan.nextDouble();

		System.out.println("Number are " + x + " and " + y + " and their product is " + (x * y));
		// all data entering at a time in a single line
		System.out.println(
				"Enter name, age, maraks, height (floating-point) and \npromoted or not (boolean) (giving whitespace):");
		String name = scan.next();
		byte age = scan.nextByte();
		short marks = scan.nextShort();
		float height = scan.nextFloat();
		
		System.out.println(
				"The values entered: " + name + ", " + age + ", " + marks + ", " + height);

		scan.close();
	}

}
