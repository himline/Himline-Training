package com.himline.assesment;

import java.util.Scanner;

public class Arraysingle {
	static String[] arraylist = { "name-1 ", "name-2", "name-3", "name-4", "name-5", "name-6", "name-7", "name-8",
			"name-9", "name-10" };

	public static void main(String[] args) {
		for (int i = 0; i <= arraylist.length; i++) {

			Scanner sc = new Scanner(System.in);
			System.out.println("enter int");
			
			i = sc.nextInt();
			System.out.println(arraylist[i]);
		}
	}
}
