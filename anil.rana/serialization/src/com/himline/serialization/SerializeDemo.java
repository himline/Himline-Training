package com.himline.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializeDemo {

	public static void main(String[] args) {
		
		Person pSerialize = new Person();
		pSerialize.setFirstName("Anil");
		pSerialize.setLastName("Rana");
		pSerialize.setPAN("ASD1456G");
		pSerialize.setAadharCard("QWEX1456893T");
		pSerialize.setMobile("9811660976");
		Address address = new Address("7A", "Madya Marg", "Chandigarh", "Punjab", "IN");
		pSerialize.setPersonAddress(address);

		try {
			FileOutputStream fileOut = new FileOutputStream("person.txt");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(pSerialize);
			objectOut.close();
			fileOut.close();
			System.out.println("Object File Created");
		} catch (IOException i) {
			i.printStackTrace();
			System.out.println("Error in Object File");
		}

	}

}
