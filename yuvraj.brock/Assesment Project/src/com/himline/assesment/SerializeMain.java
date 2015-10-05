package com.himline.assesment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeMain {

	public static void main(String[] args) throws ClassNotFoundException {

		Sample emp = new Sample();
		emp.setEmployeeId(101);
		emp.setEmployeeName("arpit");
		emp.setDepartment("cse");
		
		Sample emp1 = new Sample();
		emp1.setDepartment("ece");
		emp1.setEmployeeName("paga");
		
		
		//file 
		File file = new File("fileWrite2.txt");
		FileWriter fw = null;
		
		
		//serialization start
		try {
			fw = new FileWriter(file);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			fw.write("emp");
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {

			FileOutputStream fileOut = new FileOutputStream(file);
			ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
			outStream.writeObject(emp);
			outStream.writeObject(emp1);
			outStream.close();
			fileOut.close();
			fw.flush();
			fw.close();
		} catch (IOException i) {
			i.printStackTrace();
		}
		
		
		
		
		
		
		
		//deserialization starts
		FileInputStream filein = null;
		try {
			filein = new FileInputStream(file);
			ObjectInputStream inStream = new ObjectInputStream(filein);
			emp = (Sample) inStream.readObject();
			emp1 = (Sample) inStream.readObject();
			inStream.close();
			filein.close();
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		System.out.println("Deserialized Employee...");

		System.out.println("Emp id: " + emp.getEmployeeId());

		System.out.println("Name: " + emp.getEmployeeName());

		System.out.println("Department: " + emp.getDepartment());
		System.out.println("Department1: " + emp1.getDepartment());

	}
}