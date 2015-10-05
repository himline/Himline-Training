package com.himline.collection;

import java.util.*;

public class HashTable {
	public static void main(String[] args) {

		Hashtable ht = new Hashtable();

		ht.put("apple", "red");
		ht.put(10, 20);
		ht.put("birthday", new Date());
		ht.put("interest", 200.5);

		Set s1 = ht.keySet(); // get key 
		Collection s2 = ht.values(); // get value

		System.out.println(s1);
		System.out.println(s2);
		System.out.println("apple value before overriding: " + ht.get("apple"));

		ht.put("apple", "green");
		System.out.println("apple value after overriding: " + ht.get("apple"));

		System.out.println("Key birthday exists: " + ht.containsKey("birthday"));
		System.out.println("Value 200.5 exists: " + ht.contains(200.5));

	}

}
