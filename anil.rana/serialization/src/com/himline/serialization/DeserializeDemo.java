package com.himline.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeserializeDemo {

	public static void main(String[] args) {

		Person pDeserialize = null;

		try {
			FileInputStream fileIn = new FileInputStream("person.txt");
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			pDeserialize = (Person) objectIn.readObject();
			objectIn.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Person Class Not Found");
			c.printStackTrace();
			return;
		}

		System.out.println("Deserializing Person...");
		pDeserialize.getPersonInfo();
		
	}

}
