package com.himline.casting;

public class IntTo {
	public static void main(String[] args) {

		// int to float casting
		int i1 = 65; // int 4 byte
		float f1 = i1; // implicit casting - float 4 byte
		System.out.println(f1);

		// int to byte casting

		// byte b1 = i1; // explicit casting- error 4 bytes to 1 bytes

		byte b1 = (byte) i1; // implicit casting -
		System.out.println(b1);

		// int to short casting

		// short s1 = i1; // implicit casting- error, 4 bytes to 2 bytes

		short s1 = (short) i1; // explicit casting - int is type converted to
								// short
		System.out.println(s1);

		// int to long casting

		long l1 = i1; // implicit casting - 4 bytes assigned to 8 bytes
		System.out.println(i1);

		// int to double casting

		double d1 = i1; // implicit casting - int is type converted to double
		System.out.println(d1);

		// int to character casting

		// char ch = i1; // explicit casting -error, 4 bytes to 2 bytes

		char ch = (char) i1; // implicit casting - int is type converted to char
		System.out.println(ch);

		// int to boolean casting

		int x = 10;
		int y = 20;
		boolean b = (x == y);
		System.out.println(b); // prints false

	}
}