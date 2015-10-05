package com.himline.assesment;

import java.io.Serializable;
import java.util.*;

public class VectorMethods {
	public static void main(String args[]) {
		Vector<Serializable> vect1 = new Vector<Serializable>(15,2);
		System.out.println("\nBefore adding elements isEmpty(): " + vect1.isEmpty());
		// adding elements
		vect1.addElement("apple");
		vect1.add(10);
		vect1.addElement(10.5);
		Date d = new Date();
		vect1.add(d);
		vect1.add(10);
		StringBuffer sb1 = new StringBuffer("citrus");
		vect1.addElement(sb1);
		// inserting element
		vect1.insertElementAt("banana", 2);
		
		
		// miscellaneous methods
		System.out.println("After adding elements isEmpty(): " + vect1.isEmpty());
		System.out.println("Storing capacity of Vector: " + vect1.capacity());
		System.out.println("No. of elements in Vector: " + vect1.size());
		System.out.println("Vector contains 10.5: " + vect1.contains(10.5));
		System.out.println("Index of 10: " + vect1.indexOf(10));
		System.out.println("Last index of 10: " + vect1.lastIndexOf(10));
		
		
		
		// retrieval of elements
		System.out.println("First element: " + vect1.firstElement());
		System.out.println("Last element: " + vect1.lastElement());
		System.out.println("Element at 3rd position: " + vect1.elementAt(3));

		System.out.println();
	}
}