package com.himline.Exceptions;

public class ExceptionExp {

	public static void main(String[] args) {
	//Arithmetic Exception	
		try{
		int x = 200;
		int y = 0;
		int z;
			z = x/y;
			System.out.println("value of z = " +z);
			
		}catch(ArithmeticException ae){
			System.out.println("input may be zero = " +ae);
	} 
		//Null pointer Exception		
}
}
