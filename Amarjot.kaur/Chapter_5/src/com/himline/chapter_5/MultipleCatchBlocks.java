package com.himline.chapter_5;

public class MultipleCatchBlocks {
	public static void main( String args[ ] ) 
	{
		int x = 5 , y = 0 , z;
		String children[] = { "amar", "jot", "gagan" };  
		try { 
			System.out.println(z = x/y); 
			System.out.println(children[3]); 
		} 
		catch(ArithmeticException e) { 
			System.out.println("Division by zero. " + e);
			} 
		catch(ArrayIndexOutOfBoundsException e) { 
			System.out.println("Array Index problem. " + e);
			} 
		}
}
