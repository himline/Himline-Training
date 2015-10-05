package com.himline.assesment;

import java.util.*;

public class Collectionexample {

	public static void main(String[] args) {
		List<Number> mylist = new ArrayList<Number>(); // create new list
		ArrayList<Integer> arrlist = new ArrayList<Integer>(); // create new
																// list
		HashSet<Number> myset = new HashSet<Number>(); // create new set
		HashMap<String, Integer> mymap = new HashMap<String, Integer>(); // create
																			// new
																			// map
		Vector<Comparable> vec = new Vector<Comparable>(); // create new vector
		LinkedList<String> linlist = new LinkedList<String>(); // create new
																// linkedlist

		// isEmpty method
		System.out.println("List is Empty ?" + mylist.isEmpty());
		System.out.println("Set is Empty ?" + myset.isEmpty());
		System.out.println("Map is Empty ?" + mymap.isEmpty());
		System.out.println("Vector is Empty ?" + vec.isEmpty());

		// add element to list
		mylist.add(20);
		mylist.add(30);
		mylist.add(40.5);
		mylist.add(20);
		System.out.println("elements of list = " + mylist);

		// add element to Arraylist
		arrlist.add(100);
		arrlist.add(101);// 0
		arrlist.add(102);// 1
		// arrlist.add(100);//-1
		arrlist.add(99);// -1
		System.out.println("elements of Arraylist = " + arrlist);

		// add element to linkedlist
		linlist.add("200");
		linlist.add("201");
		linlist.offer("202");
		linlist.add("203");
		System.out.println("elements of linkedlist = " + linlist);

		// add element to set
		myset.addAll(mylist);
		System.out.println("elements of Hashset= " + myset);

		// add element to map
		mymap.put("A", 50);
		mymap.put("B", 60);
		mymap.put("C", 70);
		mymap.put("D", 80);
		System.out.println("elements of hashmap= " + mymap);

		// add element to vector
		vec.add("90");
		vec.add("amar");
		vec.add(80);
		System.out.println("elements of vector = " + vec);

		// swap method
		Collections.swap(vec, 1, 2);
		System.out.println("elements of vector after swapping= " + vec);

		// size method

		System.out.println("size of List =" + mylist.size());
		System.out.println("size of Set =" + myset.size());

		// Hashcode method
		int hc = myset.hashCode();
		System.out.println("Hash code of myset: " + hc);

		// remove method

		vec.remove("amar");
		System.out.println("elements of vector after remove " + vec);

		// shuffle method
		Collections.shuffle(linlist);
		System.out.println(linlist);
	}
}
