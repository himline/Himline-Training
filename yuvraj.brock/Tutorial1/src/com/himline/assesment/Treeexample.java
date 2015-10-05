package com.himline.assesment;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Treeexample {
	public static void main(String args[]) {
		// Create a tree set
		TreeSet<String> ts = new TreeSet<String>();
		// Add elements to the tree set
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		System.out.println(ts);

		// tree map
		TreeMap<String, Double> tm = new TreeMap<String, Double>();
		// Put elements to the map
		tm.put("Zara", new Double(3434.34));
		tm.put("Mahnaz", new Double(123.22));
		tm.put("Ayan", new Double(1378.00));
		tm.put("Daisy", new Double(99.22));
		tm.put("Qadir", new Double(-19.08));
		// tm.put("Qadir", new Double(-1.08));

		// Get a set of the entries
		Set<?> set = tm.entrySet();
		System.out.println("VALUE OF SET :" + set);

		// Get an iterator
		Iterator<?> i = set.iterator();
		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		// Deposit 1000 into Zara's account
		double balance = ((Double) tm.get("Zara")).doubleValue();
		tm.put("Zara", new Double(balance + 1000));
		System.out.println("Zara's new balance: " + tm.get("Zara"));

	}
}