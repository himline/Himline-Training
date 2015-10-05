package com.himline.day2;

import java.util.Scanner;

public class Arrays {
	static int[] a = new int[5];
	public static void main(String[] args) {
//		int i = 0;
//		while(i < a.length){
//			System.out.println("integer numbers ");
//			i++;
//		}
for(int i = 0; i < a.length ; i++){
	System.out.println("enter value ");
	Scanner n = new Scanner(System.in);
	a[i]=n.nextInt();
}
	}
}

