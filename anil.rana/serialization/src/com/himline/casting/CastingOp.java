package com.himline.casting;

public class CastingOp {

	static void byteTo (byte b){
		System.out.println("Byte Casting Operations:-");
		System.out.println("--------------------");
		
		//byte to short Casting
		short s = b;
		System.out.println("'byte to short' Implicit Casting - Converted Short Value: "+s );
		
		//byte to int Casting
		int i = b;
		System.out.println("'byte to int' Implicit Casting - Converted Int Value: "+i );
		
		//byte to long Casting
		long l = b;
		System.out.println("'byte to long' Implicit Casting - Converted Long Value: "+l );
		
		//byte to float Casting
		float f = b;
		System.out.println("'byte to float' Implicit Casting - Converted Float Value: "+f );
		
		//byte to double Casting
		double d = b;
		System.out.println("'byte to double' Implicit Casting - Converted Double Value: "+d );
		
		//byte to char Implicit Casting
		//char c = b; 
		System.out.println("No 'byte to char' Implicit Casting Possible");
		
		//byte to char Explicit Casting
		char c1 = (char) b;
		System.out.println("'byte to char' Explicit Casting - Converted Double Value: "+(c1 + 5));
		
		//byte to boolean Implicit Casting
		//boolean b1 = b;
		System.out.println("No 'byte to boolean' Implicit Casting Possible");
		
		//byte to boolean Explicit Casting
		//boolean b2 = (boolean) b;
		System.out.println("No 'byte to boolean' Explicit Casting Possible");
	}
	
	static void boolTo(boolean b1){
		System.out.println("Boolan Casting Operations:-");
		System.out.println("--------------------");
		
		//boolean to byte Implicit Casting
		//byte b = b1;
		System.out.println("No 'boolean to byte' Implicit Casting Possible");
		
		//boolean to byte Explicit Casting
		//byte b2 = (byte) b1;
		System.out.println("No 'boolean to byte' Explicit Casting Possible");
		
		//boolean to short Implicit Casting
		//short s = b1;
		System.out.println("No 'boolean to short' Implicit Casting Possible");
		
		//boolean to short Explicit Casting
		//short s1 = (short) b1;
		System.out.println("No 'boolean to short' Explicit Casting Possible");
		
		//boolean to int Implicit Casting
		//int i = b1;
		System.out.println("No 'boolean to int' Implicit Casting Possible");
		
		//boolean to int Explicit Casting
		//int i1 = (int) b1;
		System.out.println("No 'boolean to int' Explicit Casting Possible");
		
		//boolean to long Implicit Casting
		//long l = b1;
		System.out.println("No 'boolean to long' Implicit Casting Possible");
		
		//boolean to long Explicit Casting
		//long l1 = (long) b1;
		System.out.println("No 'boolean to long' Explicit Casting Possible");

		//boolean to char Implicit Casting
		//char c = b1;
		System.out.println("No 'boolean to char' Implicit Casting Possible");
		
		//boolean to char Explicit Casting
		//char c1 = (char) b1;
		System.out.println("No 'boolean to char' Explicit Casting Possible");

	}
	
	static void charTo(char c){
		System.out.println("Char Casting Operations:-");
		System.out.println("--------------------");
		
		//char to byte Implicit Casting
		//byte b = c;
		System.out.println("No 'char to byte' Implicit Casting Possible");	
		
		//char to byte Explicit Casting
		byte b1 = (byte) c;
		System.out.println("'char to byte' Explicit Casting - Converted Char Value: "+b1 );
		
		//char to short Implicit Casting
		//short s = c;
		System.out.println("No 'char to short' Implicit Casting Possible");
		
		//char to short Explicit Casting
		short s1 = (short )c;
		System.out.println("'char to short' Explicit Casting - Converted Char Value: "+s1 );
		
		//char to int Implicit Casting
		int i = c;
		System.out.println("'char to int' Implicit Casting - Converted Char Value: "+i );
		
		//char to long Implicit Casting
		long l = c;
		System.out.println("'char to long' Implicit Casting - Converted Char Value: "+l );
		
		//char to boolean Implicit Casting
		//boolean b2 = c;
		System.out.println("No 'char to Boolean' Implicit Casting Possible");
		
		//char to boolean Explicit Casting
		//boolean b3 = (boolean) c;
		System.out.println("No 'char to Boolean' Explicit Casting Possible");
	}
	
	
	public static void main(String[] args) {
		
		// byte Casting operations
		byte b = 10;
		byteTo(b);
		
		System.out.println("============================================================");
		
		// boolean Casting operations
		boolean b1 = true;
		boolTo(b1);
		
		System.out.println("============================================================");
		
		//char Casting operations
		char c = 'A';
		charTo(c);
		
	}

}
