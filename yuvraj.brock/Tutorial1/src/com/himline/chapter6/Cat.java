package com.himline.chapter6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cat implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static class SerializeCat {
		public static void main(String[] args) throws IOException, ClassNotFoundException {
			Cat c = new Cat(); // 2
	
				FileOutputStream fs = new FileOutputStream("fileWrite1.txt");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				os.writeObject(c); // 3
				os.close();
			
		
				FileInputStream fis = new FileInputStream("fileWrite1.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				c = (Cat) ois.readObject(); // 4
				ois.close();
			
		}
	}
}