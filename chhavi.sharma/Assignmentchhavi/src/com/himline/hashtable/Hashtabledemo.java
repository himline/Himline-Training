package com.himline.hashtable;

import java.util.*;

public class Hashtabledemo {

	public static void main(String[] args) {

		String names;
		String key;

		// Creating a Hashtable

		// Hashtable<String,String> Hashtable = new Hashtable<String, String>();

		Hashtable ht = new Hashtable();

		// Adding Key and Value pairs to Hashtable

		ht.put("key1", "Mohan");
		ht.put("key2", "Ajeet");
		ht.put("key3", "Peter");
		ht.put("key4", "Vicky");
		ht.put("key5", "Mona");

		Enumeration e = ht.keys(); // Returns an enumeration of the keys
									
		while (e.hasMoreElements()) {
			key = (String) e.nextElement();
			System.out.println("Key: " + key + " & Value: " + ht.get(key));
		}
	}
}
