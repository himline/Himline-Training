package com.himline.chapter6;

import java.io.File;
import java.io.IOException;

public class createfile {

	public static void main(String[] args) {
		try { 
			boolean newFile = false;
			File file = new File("fileWrite1.txt");
			
			System.out.println(file.exists());
			newFile = file.createNewFile(); 
			
			System.out.println(newFile);
			System.out.println(file.exists()); 
			
		} catch (IOException e) {
		}
	}
}
