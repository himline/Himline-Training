package com.himline.assesment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Arrayexample {

	// =============string array====================
	static String[] str = { "yuvraj ", "amarjot", "cgaanabk" };
	static String[] Str = new String[3];

	
	
	static String ste = "hello ";
	// ste = "welcome"; <======================can not override the existing string in same location

	
	
	
	void test() {
		ste = "welcome "; // <======================can override the existing
							// string in method
		System.out.println("the value of string in method  " + ste);

		String s1 = "spring ";
		String s2 = s1 + "summer ";

		System.out.println("concat example for string   " + s1.concat("fall "));

		s1 += "winter ";
		System.out.println(s1 + "   " + s2);
	}

	
	
	
	public static void main(String[] args) throws IOException {
		Arrayexample ae = new Arrayexample();

		System.out.println("the 0 th value of first array " + str[0]);
		System.out.println("the 0 th value of 2nd array   " + Str[0]);

		System.out.println("================string execution===================");
		ae.test();
		System.out.println("the value of string in main class  " + ae.ste);

		
		
		// ==================file i/o code=====================//
		

		// create a map to add values it value to file we create
		// map created
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("key1", "map1");
		hm.put("key2", "map1");
		System.out.println("Map value===>" + hm);

		// create a file to write the map value in it
		// file created
		File file = new File("file"); // <============"fileWrite2.txt" is the name of the file we created

		// create a file writer to add or write value in the file you created

		FileWriter fw = new FileWriter(file); // <============= refer the file name in "()" which u want
												// to edit or write

		// now time to collect the data
		// we need two collections
		// 1. for value
		// 2. for key value

		Collection<String> c = hm.values();
		Collection<String> ck = hm.keySet();

		// we collect the data of map in collections
		// to access the right location of values
		// to perform any operation on collection data

		// 1. for writing values
		// 2. for writing values

		Iterator<String> itr = c.iterator();
		Iterator<String> itrk = ck.iterator();

		// now iterate will move to every location and check the data
		// and add or edit the data according to demand

		while (itr.hasNext())
			fw.write("Hashvalue = " + itr.next() + "\n");
		while (itrk.hasNext())
			fw.write("key = " + itrk.next() + "\n");

		fw.flush();
		fw.close();

	}
}
