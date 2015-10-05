package com.himline.Code2.amarjot;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AllExamples {
	// **********Casting Operations****************
	public void cast() {
		byte b = 0;
		short s = 10;
		int i = 258;
		float f = 66.78f;
		double d = 342.78;
		long l = 76588;
		boolean boo = true;
		char ch = 'A';

		System.out.println("Conversion of byte to float"); // int to byte (1
															// byte to 4 byte)
		f = (float) b;
		System.out.println("b = " + b + "  f = " + f);

		System.out.println("Conversion of int to byte"); // int to byte (4 byte
															// to 1 byte)
		b = (byte) i;
		System.out.println("i = " + i + "  b = " + b);

		System.out.println("Conversion of float to int"); // float to int
		i = (int) f;
		System.out.println("f = " + f + " i = " + i);

		System.out.println("Conversion of double to byte"); // double to byte
		b = (byte) d;
		System.out.println("d = " + d + " b = " + b);

		System.out.println("Conversion of long to byte"); // long to byte
		b = (byte) l;
		System.out.println("l = " + l + " b = " + b);

		System.out.println("Conversion of boolean");// boolean
		boolean b1 = boo; // permitted
		System.out.println(b1); // prints true

		System.out.println("Conversion of char to short"); // char to short
		s = (short) ch; // explicit conversion from char to short
		System.out.println(s); // prints 65

	}

	// *******************************************Array***********************************************************
	public void Arr() {
		int[] marks = new int[5];
		System.out.println("Elements length  " + marks.length);
		// now assign values
		marks[0] = 10;
		marks[1] = 20;
		marks[2] = 30;
		marks[3] = 40;
		marks[4] = 50;
		for (int x = 0; x < marks.length; x++) {
			// System.out.println("enter id ");
			// Scanner scan = new Scanner(System.in);
			// marks[x]=scan.nextInt();
			System.out.println("id =  " + marks[x]);

		}
	}

	public static void main(String[] args) throws IOException {
		AllExamples ae = new AllExamples();
		ae.cast(); // *********calling cast method*************
		System.out.println("****************************************************************");

		// *******************************Using String****************************************

		String Str1 = new String("amarjot kaur");
		System.out.println("LENGTH OF STRING  " + Str1.length()); // check
																	// length of
																	// the
																	// String

		System.out.println("*****************************************************************");

		// *********************************Using StringBuffer**********************************

		StringBuffer stbr = new StringBuffer("hello");
		stbr.append("jot");
		System.out.println("Append StringBuffer  " + stbr);
		stbr.reverse();
		System.out.println("Reverse StringBuffer  " + stbr);

		System.out.println("*****************************************************************");

		ae.Arr(); // ***********Calling Array method***********
		System.out.println("*****************************************************************");

		// **********************************IO
		// Streams*********************************************************

		File file = new File("jott.txt");
		file.createNewFile(); // creates the file
		FileWriter fw = new FileWriter(file);
		fw.write("IOStreams");
		fw.flush();
		fw.close();

		FileReader fr = new FileReader(file);
		char[] ch = new char[10];
		fr.read(ch);
		for (char a : ch) {
			System.out.println(a);
			fr.close();
		}
		System.out.println("*****************************************************************");

		// *********************************Hashlist and HashSets*********************************************

		List listarr = new ArrayList();
		HashSet hs = new HashSet();

		// add elements to the list
		
		listarr.add("amar"); // duplicate values
		listarr.add("jot");
		listarr.add("jot");
		listarr.add("amar");
		int Size = listarr.size();
		System.out.println("size of list = "+Size);
		
//		Iterator iterator = listarr.iterator();
//		while (iterator.hasNext()) {
//			fw.write("list = " iterator.next());
//		}
		System.out.println(listarr);

		// add elements to the hash set
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("A"); // replace duplicate values in sets
		System.out.println(hs);

	}

}
