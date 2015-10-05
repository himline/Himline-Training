package com.himline.Chapter_7;

import java.util.*;

class TestGeneric {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("rahul");
		list.add("jai");
		//list.add(new Integer(32), null);//compile time error

		String s = list.get(1);// type casting is not required
		System.out.println("element is: " + s);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
