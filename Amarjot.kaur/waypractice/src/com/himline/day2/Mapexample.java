package com.himline.day2;

import java.util.*;

public class Mapexample {
	public static void main(String[] args) {
		Hashtable ht1 = new Hashtable(); // create hashtable

		// put elements to the hashtable
		ht1.put("apple", "red"); // key and value
		ht1.put(10, 20);
		ht1.put("birthday", 1555);
		ht1.put("interest", 200.5);

		Hashtable ht2 = new Hashtable();
		ht2.putAll(ht1);

		System.out.println(ht2);

		Set s1 = ht1.keySet();
		Collection s2 = ht1.values();

		System.out.println("apple value before overriding: " + ht1.get("apple"));

		System.out.println(s1);
		System.out.println(s2);

		ht1.put("apple", "green");
		System.out.println("apple value after overriding: " + ht1.get("apple"));

		System.out.println("Key birthday exists: " + ht1.containsKey("birthday"));
		System.out.println("Value 200.5 exists: " + ht1.contains(254644500.5));

	}
}
