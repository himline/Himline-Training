package com.himline.day2;

public class Cast {

	public static void main(String[] args) {
		byte b = 0;
		int i = 358;
		float f = 56.78f;
		double d = 432.78;
		boolean boo = true;
		char ch = 'A';
		 
		System.out.println("Conversion of int to byte"); //int to byte
		b = (byte) i;
		System.out.println("i = " +i + "  b = " +b);
		
		System.out.println("Conversion of float to int"); //float to int
		i = (int) f;
		System.out.println("f = "+f +" i = "+i);
		
		System.out.println("Conversion of double to float");  //double to float
		b = (byte) d;
		System.out.println("d = "+d + " b = " +b);
		     
		System.out.println("Conversion of float to byte");             	          
	    byte b1 = (byte) f;        // 4 bytes type casted to 1 byte
	    System.out.println("f = "+f + " b1 = " +b1);    
	  
	    //Not permitted.
	  
//	    System.out.println("Conversion of boolean to byte");
//	    byte x = boo;                 // error, boolean to byte
//
//	    System.out.println("Conversion of boolean to int");
//	    int x = boo;                  // error, boolean to int
//
//	    System.out.println("Conversion of boolean to char");
//	    char ch = boo;                // error, boolean to char
//
//	    System.out.println("Conversion of boolean to boolean");
//	    boolean boo =ch;              // error, char to boolean
		
	}

}
