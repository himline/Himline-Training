package com.himline.IOstreams;

import java.io.*;

public class IOExample {

	public static void main(String[] args) throws IOException {

		File file = new File("ioexp.txt");
		file.createNewFile();
		FileWriter fw = new FileWriter(file);
		fw.write("äbcdefghij");
		fw.flush();
		fw.close();
		try{
		FileInputStream fi = new FileInputStream("ioexp.txt");
		FileOutputStream fo = new FileOutputStream("output stream");
		int x;
		while ((x = fi.read()) != -1) {
			fo.write(x);
			System.out.println(x);
		}
			fo.close();
			fi.close();
		
		}catch(FileNotFoundException e){
		System.out.println("file not found" +e);
	}
		catch(IOException ie){
			System.out.println("IO problem" +ie);
		}

}
}
