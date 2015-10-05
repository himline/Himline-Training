package com.himline.day2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestIO {
	public static void main(String[] args) {
		IOClass ioo = null;
       // try and catch block
		try {
			FileInputStream filein = new FileInputStream("./IO.txt");    //file inputstream
			ObjectInputStream In = new ObjectInputStream(filein);        
			ioo = (IOClass) In.readObject();
			In.close();
			filein.close();
		} catch (IOException i) {         //using multi catch block
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("IO Class not found ");
			c.printStackTrace();
			return;
		}
		System.out.println("desializing ");
		System.out.println("first name of  " + ioo.firstname);
		System.out.println("last name of  " + ioo.lastname);
	}
}
