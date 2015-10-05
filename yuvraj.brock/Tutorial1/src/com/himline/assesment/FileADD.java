package com.himline.assesment;

import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class FileADD {
	/*
	 * 1. motive of this program is to add every single value into txt \ file
	 * when and input added by scanner.
	 */

	/*
	 * 2. first create a array of string to enter values in it by scanner
	 * 
	 */
	static String[] str = new String[5];

	public static void main(String[] args) {

		// create scanner to enter values to add in array 'str"
		Scanner sc = new Scanner(System.in);

		/*
		 * create a for loop to add value into array according to array size and
		 * index
		 * 
		 */
		for (int i = 0; i < str.length; i++) {
			System.out.println("enter string values");
			str[i] = sc.nextLine();
			System.out.println(str[i]);

		}

		try {

			/*
			 * now select or create the file to edit or add data
			 */
			File file = new File("fileWrite2.txt");
			FileWriter fw = new FileWriter(file);

			System.out.println(" name to be searched:");

			/*
			 * create another loop to add the value into the file according to
			 * location and value from str array
			 * 
			 */
			for (int i = 0; i < str.length; i++) {

				fw.write(str[i]);
			}

			fw.flush();
			fw.close();

		} catch (IOException e) {

		}
	}

}
