package com.himline.chapter5;

public class classswitchstring {
	static String s = "dfgdfgxyz";

	public static void main(String[] args) {
		switch (s.length()) {
		case 1:
			System.out.println("length is one");
			break;
		case 2:
			System.out.println("length is two");
			break;
		case 3:
			System.out.println("length is three");
			break;
		default:
			System.out.println("no match");
		}

	}
}