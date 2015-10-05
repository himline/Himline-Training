package com.himline.practice;

import java.util.Scanner;

public class whileEmp {
	static String[] arraylist = new String[5];
	public static void main(String[] args) {
		int i = 0;
		while(i  < arraylist.length){
			System.out.println("enter name ");
			Scanner scan = new Scanner(System.in);
			arraylist[i]=scan.nextLine();
			i++;
		}
		System.out.println(" name to be searched:");
		Scanner scan = new Scanner(System.in);
      while(i < arraylist.length){
    	  if (scan.nextLine().toString().equals(arraylist[i].toString()))   
    		  System.out.println("found "+ i);
    		  i++;
      }
	}

}
