//list , Arraylist , Linkedlist, Hashset , Hashmap , vector , Treeset
package com.himline.Collections;

import java.util.*;

public class CollectionExp {
	public static void main(String[] args) {
		List mylist = new ArrayList(); // create new list
		ArrayList arrlist = new ArrayList(); // create new list
		HashSet myset = new HashSet(); // create new set
		HashMap mymap = new HashMap(); // create new map
		Vector vec = new Vector(); // create new vector
		LinkedList linlist = new LinkedList(); // create new linkedlist

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
		System.out.println("elements of linklist after shuffle " + linlist);

		// indexof and lastindexof
		System.out.println("Index of 20 in list = " + mylist.indexOf(20));
		System.out.println("LastIndex of 20 in list = " + mylist.lastIndexOf(20));

		// get method
		System.out.println("get the value of Arraylist = " + arrlist.get(1));

		// Contains method
		System.out.println("Set contains 30 = " + myset.contains(30));

		// iteration
		Iterator it = vec.iterator();
		while (it.hasNext()) {
			System.out.println("Elements with iteration = " + it.next());
		}

		// max , min
		// System.out.println("max value of vector = " + Collections.max(vec));
		// System.out.println("min value of vector = " + Collections.min(vec));

		// binary search method
		System.out.println("elements of Arraylist  ahdjsahk = " + arrlist);
		System.out.println("Index of 100 = " + Collections.binarySearch(arrlist, 99));

		// create Treeset
		TreeSet trset = new TreeSet(arrlist);
		System.out.println("Sorted element of Arraylist = " + trset);

		// fill method
		Collections.fill(arrlist, 200);
		System.out.println("Arraylist elements filled with 200 = " + arrlist);

		List list2 = new ArrayList();
		list2.add(20);
		list2.add(30);

		// equals method
		System.out.println("Elements of list equals to list2 ? = " + mylist.equals(list2));

		// retianAll
		mylist.retainAll(list2);
		System.out.println("list after retainall  = " + mylist);

		// sublist
		List li = linlist.subList(1, 3);
		System.out.println("elements of sublist = " + li);

		// Listiterator
		System.out.print("\nElements with ListIterator: ");
		ListIterator it2 = linlist.listIterator();
		while (it2.hasNext()) {
			System.out.print(it2.next() + " ");
		}

		// peek and poll
		System.out.println("peek  = " + linlist.peek());
		System.out.println("poll  = " + linlist.poll());

		// clear method
		mylist.clear();
		System.out.println("list size after calling clear()  = " + mylist.size());
		arrlist.clear();
		System.out.println("liknedlist size after calling clear()  = " + arrlist.size());

	}
}
