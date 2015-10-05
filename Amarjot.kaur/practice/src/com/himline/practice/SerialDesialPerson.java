package com.himline.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialDesialPerson {

	public static void main(String[] args) {
		Persondetails PD = new Persondetails();
		PD.setName("amarjot kaur");
		PD.setHouseNo(123);
		PD.setPhoneNO(896864567);
	//Serialize	
		try{
			FileOutputStream outfl = new FileOutputStream("person.text");
			ObjectOutputStream outob = new ObjectOutputStream(outfl);
			outob.writeObject(PD);
			outob.close();
			outfl.close();
		}catch(IOException i){
			i.printStackTrace();
		}
		
	//Deserialize
		try{
			FileInputStream infl = new FileInputStream("person.text");
			ObjectInputStream obstin = new ObjectInputStream(infl);
			PD = (Persondetails) obstin.readObject();
			obstin.close();
			infl.close();	
		}catch(IOException i){
			i.printStackTrace();
		}
		catch(ClassNotFoundException c){
			System.out.println("Persondetails Class not found ");	
			c.printStackTrace();
			return;
		}
		System.out.println("desializing Persondetails ");
		System.out.println("Name of Person " + PD.getName());
		System.out.println("HouseNO of Person " + PD.getHouseNo());
		System.out.println("PhoneNO of Person " + PD.getPhoneNO());
	}

}
