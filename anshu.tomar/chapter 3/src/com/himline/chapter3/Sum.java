
package com.himline.chapter3;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		System.out.println("enter the elements");
		for (int i = 0;i<10; i++) {
			Array[i] = scanner.nextInt();
		}
		for (int num : Array) {
			sum = sum + num;
		}
		System.out.println("sum of array element is : sum");
	}
}
