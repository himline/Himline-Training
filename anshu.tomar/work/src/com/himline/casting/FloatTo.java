package com.himline.casting;

public class FloatTo {

	public static void main(String[] args) {
		// float to byte casting 
		float f1 = 20.5f; // float is 4 bytes
//		byte b1 =  f1  //  no implicit casting - error as 4 bytes to 1 bytes
    	byte b2 = (byte)f1;  // explicit casting - 4 byte type casted to 1 bye 
		System.out.println(b2); 
		
		
		//        float to short casting 
		
		 
//	     short s1 = f1;                // no implicit casting - error 4 bytes value to 2 bytes
	          
	    short s1 = (short) f1;           // explicit casting - 4 bytes value type casted to short
	    System.out.println(s1);          
	    
	    
	 //     float to int casting 
	    
	   
//      int i1 = f1;             // no implicit casting - Error 4 bytes value to 2 bytes
        
        int i1 = (int) f1;       // explicit casting - 4 bytes value type casted to short
        System.out.println(i1);  
        
        
        //     float to long casting 
        
       
	       // long l1 = f1;               // no implicit casting-error float is 4 bytes and long is 8 bytes.  
	          
	          long l1 = (long) f1;        // explicit casting-4 bytes is type casted to 8 bytes
	          System.out.println(l1);     // 
	          
	}
}