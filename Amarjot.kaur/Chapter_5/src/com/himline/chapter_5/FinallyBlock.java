package com.himline.chapter_5;

public class FinallyBlock {
	public static void main(String args[]) { 
	int marks[ ] = { 76, 57, 83, 46, 38 }; 
	System.out.println("My test is starting"); 
	//marks = null;
	try { 
		System.out.println(marks[10]);
	}
	catch(ArithmeticException e) {
		System.out.println("Some problem: " + e); 
		}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Hello stay in your limits : " + e); 
		}
	catch(NullPointerException e) {
		System.out.println("Hello what are you trying to print, you have nothing in it  : " + e); 
		}
	finally { 
		System.out.println("My test is Ended"); 
		}
	} 
}
