package Grossarystore;

import java.util.UUID;

public class Exceptionexample {
	public static void main(String[] args) {
		int marks[] = { 40, 50, 60 };

		// NULL POINTER EXCEPTION
		try {
			// Example 1: NPE will be thrown if you are trying to access null
			// Object
			CrunchifyNPE2();
		} catch (NullPointerException npe1) {
			System.out.println("Exception in CrunchifyNPE1()");
			npe1.printStackTrace();
		}

		// ARRAY INDEX OUT OF BOUND EXCEPTION
		try {
			System.out.println(marks[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Wrong index number, please enter correct number. " + e);
			e.printStackTrace();
		}

		// STRING OUT OF BOUND EXCEPTION
		String str = "hello";
		
			System.out.println(str.charAt(5));
					//System.out.println("Wrong character index number, please enter correct number. " + e);
		

		// CLASS CAST EXCEPTION
		try {
			Object i = Integer.valueOf(42);
			String s = (String) i;
		} catch (ClassCastException ce) {
			System.out.println("THIS CONVERSION IS NOT POSSIBLE " + ce);

		}

		
		//ARITHMETIC EXCEPTION
		try {
			int num1 = 30, num2 = 0;
			int output = num1 / num2;
			System.out.println("Result = " + output);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception: You can't divide an integer by 0");
		}
	}

	private static void CrunchifyNPE2() {
		// String crunchifyString;
		// crunchifyString = "http://crunchify.com";
		// System.out.println("\nvalue: " + crunchifyString.toString() + ",
		// lenght: " + crunchifyString.length());
		// System.out.println("No NPE exception on line 51");
		//
		// // Now Let's create NPE
		String crunchifyString2 = null;
		System.out.println(crunchifyString2.toString());

	}
}
