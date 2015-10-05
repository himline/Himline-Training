package com.himline.collection;

import java.util.*;

public class LinkedListSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myList = new LinkedList();
		myList.add("zero");
		myList.add("one");
		myList.add("two");
		myList.add("nine");
		myList.add("ten");

		// SORTING IN ASCENDING ORDER
		Collections.sort(myList);
		System.out.println("Sorted elements: " + myList);

		// REVERSED ELEMENTS
		Collections.reverse(myList);
		System.out.println("Reversed sorted elements: " + myList);
	}

}
