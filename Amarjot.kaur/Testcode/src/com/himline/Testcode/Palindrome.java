
package com.himline.Testcode;

import java.io.*;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//find String palindrome or not using scanner  
		String original;
		String reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to check if it is a palindrome");
		original = in.nextLine();

		int length = original.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);

		if (original.equals(reverse))
			System.out.println("Entered string is a palindrome.");
		else
			System.out.println("Entered string is not a palindrome.");
		
		
		//find integer value palindrome or not using BufferReader 
		 int n = 0;
		 System.out.println("Enter a number to check");
		 //input from console
		 try {
		 BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));	
			n = Integer.parseInt(buffer.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		 int num = n;
		 int reversenum = 0;
		 int temp = 0;
		 //reverse
		 while(num > 0){
			 temp = num % 10;
			 num = num / 10;
			 reversenum = reversenum * 10 + temp;	 
		 }
		 System.out.println("reversenumber = " +reversenum);
		 if(n == reversenum){
			 System.out.println("number is palindrome " +n);	 
		 }else{
			 System.out.println("number is not palindrome  "+n);
		 } 
	}
}