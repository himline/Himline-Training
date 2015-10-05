package com.himline.day2;

import java.util.Date;

public class Conversion {

	public static void main(String args[]) {
		int i = 1000;
		double d = 100.6;
		byte b = 10;
		boolean cyclone = false;
		Date currentDay = new Date(); // Date object, currentDay

//		String s1 = String.valueOf(i); // int to string
//		String s2 = String.valueOf(d); // double to string
//		String s3 = String.valueOf(b); // byte to string
//		String s4 = String.valueOf(cyclone); // boolean to string
//
//		String s5 = String.valueOf(currentDay); // Date object to string

		System.out.println(i);
		System.out.println(d);
		System.out.println(b);
		System.out.println(cyclone);
		System.out.println("Using valueOf(): " + currentDay);

	}
}
