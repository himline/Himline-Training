package com.himline.practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClass {

	public static void main(String[] args) {
		EmployeeSerial emp =new EmployeeSerial();
		emp.firstname = "Amarjot";
		emp.lastname = "kaur";
		
		try{
			FileOutputStream fileout = new FileOutputStream("./employeeserial.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fileout);
			objout.writeObject(emp);
			objout.close();	
			fileout.close();
			System.out.println("serialization data is saved in ./employeeserial.txt ");			
		}
		catch(IOException i){
			i.printStackTrace();	
		}
	}

}
