package com.himline.Testcode;

import java.util.Scanner;

public class Maths {
	static int i = 0;
	static double[] arr = new double[10];
	static double num;
	static double a;
	static double a1;
	static double a2;
	static double a3;

	public static void main(String[] args) {
		for (; i < arr.length; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter number");
			arr[i] = scan.nextDouble();
		}
		//Addition------
		for (Double d : arr) {
			a = a + d;
		}
		System.out.println(" Addition =  " + a);
		
		//subtraction----
		for (Double d : arr) {
			a1 = a1 - d;
		}
		System.out.println(" number subtraction  " + a1);
		
        //multiply------
		for (Double d : arr) {
			a2 = a2 * d;
		}		
		System.out.println(" number multiply " + a2);
		if(a2 == 0){
			System.out.println("you enter zero value in multiply ");
		}
		
		//divide------
		try {
			for (Double d : arr) {
				a3 = a3 / d;
			}
			System.out.println(" number divide  " + a3);
			
		} catch (ArithmeticException ae) {
			System.out.println("input may be zero = " + ae);
		}
	}
}
