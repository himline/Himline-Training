package com.himline.Chapter_6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StringBufferAppend {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("set ");
		sb.append("point");
		System.out.println(sb);
		StringBuffer sb2 = new StringBuffer("pi = ");
		sb2.append(3.14159f);
		System.out.println(sb2);
		
		System.out.println("your buffer size :" +sb2.capacity());
		int cutoff=3;
		if(cutoff < sb2.length()){
		   System.out.println("your Substring :" +sb2.substring(cutoff));
		}
		
		File myfile = new File("myfile.txt");
		try {
			FileOutputStream fos = new FileOutputStream(myfile);
			try {
				fos.write(sb2.toString().getBytes());
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}

