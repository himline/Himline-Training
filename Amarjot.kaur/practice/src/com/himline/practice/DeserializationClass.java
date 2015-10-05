package com.himline.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationClass {

	public static void main(String[] args) {
		EmployeeSerial emp = null;
		
		try{
			FileInputStream filein = new FileInputStream("./employeeserial.txt");
			ObjectInputStream In = new ObjectInputStream(filein);
			emp = (EmployeeSerial) In.readObject();
			In.close();
			filein.close();		
		}catch(IOException i){
			i.printStackTrace();
			return;
		}catch(ClassNotFoundException c){
			System.out.println("EmployeeSerial Class not found ");	
			c.printStackTrace();
			return;
		}
		System.out.println("desializing employee ");
		System.out.println("first name of employee " + emp.firstname);
		System.out.println("last name of employee " + emp.lastname);
	}

}
