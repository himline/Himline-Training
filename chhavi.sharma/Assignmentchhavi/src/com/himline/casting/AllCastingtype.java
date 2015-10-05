package com.himline.casting;

public class AllCastingtype {

	public static void main(String[] args) {
		
		// byte to short casting operation
		byte b1 = 10;  // 1 byte
		short s1 = b1;  // 1 byte to 2 byte 
		System.out.println(s1);
		
		
	   // byte  to int casting 
		int i1 = b1;   // 1 byte to 4 byte
		System.out.println(i1);  // print i1
		
		
		// byte to long casting 
		long l1 = b1; // 1 byte to 8 byte
		System.out.println(l1);  // print l1
		
		
		// byte to double casting
		double d1 = b1; // 1 byte to 8 byte
		System.out.println(d1);  // print d1
		
		// byte to float casting
		float f1 = b1; // 1 byte to 4 byte
		System.out.println(f1);  // print f1
		
		// byte to char casting
		 // char ch = b1;
		 char ch = (char) b1; 
		 System.out.println(ch);
		 
		 // byte to boolean casting
		 //  boolean b = b1;   no explict & implict casting
		 
//*********************************y6ebhyehuy76ejuh**************************************************
		 
		    // short to byte casting
		  short s2 = 66;  // 2 bytes
	       // byte b1 = s1;  
	       byte b2 = (byte) s2;
	      System.out.println(b2);     // prints 15
	      
	      // short to int casting
	      // int i2 = s2;
	      int i2 = (int) s2;
	      System.out.println(i2);
	      
	       // short to long casting
	       long l2 = s2;               // 2 bytes assigned to 8 bytes
	      System.out.println(l2);     // prints 15
	      
	      // short to float casting
	      float f2 = s2;                  // 2 bytes assigned to 4 bytes
	      System.out.println(f2);         // prints 15.0
	      
	      // short to double casting
	      double d2 = s2;         // 2 bytes assigned to 8 bytes
	      System.out.println(d2);     // prints 15.0
	      
	      // short to char casting
	      // char ch2 = s2;  
	      char ch2 = (char) s2;  
	      System.out.println(ch2); // print 
	      
	      //short to boolean casting
	      // boolean b = s2; no explict & implict casting
	      
	      System.out.println();
	      
	      
	      
//***************************************hgfgygku****************************************************	      
	        
	     
	      
	      // int to byte casting
           int i3 = 18;                         // error
           byte b3 = (byte) i3;
          System.out.println(b3);     // prints 18
          
          // int to short
          // short s1 = i1;        // error, 4 bytes to 2 bytes
          short s3 = (short) i3;       // int is type converted to short
          System.out.println(s3);     // prints 18
          
          System.out.println();
	      
	      
	      
//*********************************hsgd*************************************************************
          
          // char to byte casting
          char ch3 = 'A';            // 4 bytes
          // byte b4 = f3;                // error as 4 bytes to 1 byte
           byte b4 = (byte) ch3;        // 4 bytes type casted to 1 byte
           System.out.println(b4);     // prints 65
           
             
             //char to int casting
             char ch4 = 'A';                // 2 bytes
             int i5 = ch4;                  // 2 bytes to 4 bytes
             System.out.println(i5);      // prints 65 (ASCII value of A)
             
             // Char to boolean casting
                  // boolean b = true;
                    // char ch = b;                 // no explict & implict casting
             
             
//************************************yfg***********************************************************       
	    
                // boolean to byte casting
             // boolean b = true;
             // byte b5 = b;  // no explict & implict casting
             
             // boolean to int casting
             //boolean b = true;
             // int x = b;  // no explict & implict casting
	}
}
		 
		 
 		 
		 
	

		 

	


