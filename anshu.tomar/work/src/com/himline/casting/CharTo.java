package com.himline.casting;

public class CharTo {

	public static void main(String[] args) {
		// character to short casting 


        char ch = 'A';              // 2 bytes
     // short s1 = ch;              // error, char to short
        
        short s1 = (short) ch; // explicit casting from char to short
        System.out.println(s1);   // prints 65 (ASCII value of A)
        
        // character to int  casting 
        
       
        int i1 = ch;                  //implicit casting- 2 bytes to 4 bytes
        System.out.println(i1);      
        
        // character to long 
       
        long l1 = ch;               // implicit casting 2 bytes to 8 bytes
        System.out.println(l1);     
        //  character to float
   
        float f1 = ch;          // implicit casting -2 bytes to 4 bytes
        System.out.println(f1); 
        
        // character to boolean casting
        
//        boolean b = ch; no implicit casting is possible 
//       boolean b1 =(boolean)ch; // no explicit casting 
//        System.out.println(b1);     
        
        
        
	}

}
