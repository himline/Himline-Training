package com.himline.day2;

import java.util.Hashtable;

public class MyHashtable {
	public static void main(String a[]) {
		Hashtable<String, String> ht = new Hashtable<String, String>(); // create hashtable
		//put elements to the hashtable
		ht.put("first", "inserted");
		ht.put("second", "second inserted");
		ht.put("third", "third inserted");
		
		System.out.println(ht); // print
		
		System.out.println("Value of key 'second': " + ht.get("second"));
		
		System.out.println(" is hashtable empty? " + ht.isEmpty()); // is hashtable is empty??
		ht.remove("third");
		System.out.println(ht);
		
		System.out.println("Size of the Hashtable: " + ht.size());
	}
}
