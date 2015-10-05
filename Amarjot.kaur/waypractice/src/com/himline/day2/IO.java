package com.himline.day2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IO {
	public static void main(String[] args) {
		IOClass ioo = new IOClass(); //create object of IOClass
		ioo.firstname = "Amarjot";
		ioo.lastname = "kaur";
         //try and catch block
		try {
			FileOutputStream fileout = new FileOutputStream("./IO.txt");  //file outputstream
			ObjectOutputStream objout = new ObjectOutputStream(fileout);
			objout.writeObject(ioo);
			objout.close();
			fileout.close();
			System.out.println("serialization data is saved in ./IO.txt ");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}
