package com.himline.chapter_5;
import java.util.Scanner;
public class Assertion {
	public static void main( String args[] ){  
		  
		  Scanner scanner = new Scanner( System.in );  
		  System.out.print("I am testing if you are adult ");  
		  System.out.print("Enter ur age ");  
		    
		  int value = scanner.nextInt();  
		  assert value >= 18;  
		  System.out.println("Yes you are adult");  
		 }  
}
