package com.himline.assesment;

public class Casting {
	public static void main(String[] args) {
		System.out.println("======================float conversion===========================");
		float f1 = 10.5f; // 4 bytes
		// byte b1 = f1; // error as 4 bytes to 1 byte
		byte b1 = (byte) f1; // 4 bytes type casted to 1 byte
		System.out.println(b1); // prints 10

		float f4 = 10.5f; // 4 bytes
		// short s1 = f1; // 4 bytes value to 2 bytes
		short s1 = (short) f4; // 4 bytes value type casted to short
		System.out.println(s1); // prints 10

		float f5 = 10.5f; // 4 bytes
		// int i1 = f1; // 4 bytes value to 2 bytes
		int ii1 = (int) f5; // 4 bytes value type casted to short
		System.out.println(ii1); // prints 10

		float f6 = 10.5f; // 4 bytes
		// long l1 = f1; // error
		long ll1 = (long) f6; // data truncation
		System.out.println(ll1); // prints 10

		float f7 = 10.5f; // 4 bytes
		double d1 = f7; // type converted 4 bytes float to 8 bytes double
		System.out.println(d1); // prints 10.5

		float f8 = 65.5f; // 4 bytes
		// char ch = f1; // error, 4 bytes to 2 bytes
		char cch = (char) f8; // type converted from float to char
		System.out.println(cch); // prints A (ASCII value of 65)

		float x = 10.5f;
		float y = 20.5f;
		boolean b = (x == y);
		System.out.println(b); // prints false

		System.out.println("======================char conversion===========================");
		char ch = 'A'; // 2 bytes
		// short s1 = ch; // error, char to short
		short s2 = (short) ch; // explicit conversion from char to short
		System.out.println(s2); // prints 65 (ASCII value of A)

		char ch1 = 'A'; // 2 bytes
		int i1 = ch1; // 2 bytes to 4 bytes
		System.out.println(i1); // prints 65 (ASCII value of A)

		char ch2 = 'A'; // 2 bytes
		long l1 = ch2; // 2 bytes to 8 bytes
		System.out.println(l1); // prints 65 (ASCII value of A)

		char ch3 = 'A'; // 2 bytes
		float f2 = ch3; // 2 bytes to 4 bytes
		System.out.println(f2); // prints 65.0 (ASCII value of A is 65)

		char ch4 = 'A'; // 2 bytes
		double dd1 = ch4; // 2bytes to double of 8 bytes
		System.out.println(dd1); // prints 65.0 (ASCII value of A is 65)

		System.out.println("======================double conversion===========================");

		double d2 = 10.5; // 8 bytes
		// byte b1 = d1; // error as 8 bytes to 1 byte
		byte b2 = (byte) d1; // 8 bytes double type casted to 1 byte val
		System.out.println(b2); // prints 10; observe 0.5 is lost

		double d3 = 10.5; // 8 bytes
		// short s1 = d1; // 8 bytes value to 2 bytes
		short ss2 = (short) d3; // 8 bytes double value type casted to 2 bytes
								// short
		System.out.println(ss2); // prints 10; 0.5 gone

		double d4 = 10.5; // 8 bytes
		// int i1 = d1; // 8 bytes value to 4 bytes
		int i2 = (int) d4; // 8 bytes value type casted to int of 4 bytes;
		System.out.println(i2); // prints 10, 0.5 gone

		double d5 = 10.5; // 8 bytes
		// long l1 = d1; // error, double to long
		long l2 = (long) d5; // data truncation, 0.5 gone
		System.out.println(l2); // prints 10

		double d6 = 10.5; // 8 bytes
		// float f1 = d1; // error, double to float, no implicit
		float f3 = (float) d6; // explicit casting
		System.out.println(f3); // prints 10.5, but as float

		double d7 = 65.5; // 8 bytes
		// char ch = d1; // 8 bytes to 2 bytes
		char ch5 = (char) d7; // 8 bytes double is type casted to 2 bytes char
		System.out.println(ch5); // prints A (ASCII value of 65)

		System.out.println("======================boolean conversion===========================");

		boolean bb = true;
		boolean b3 = bb; // permitted
		System.out.println(b3); // prints true

		int xx = 10;
		int yy = 20;
		boolean b4 = (xx == yy);
		System.out.println(b4); // prints false

	}
}
