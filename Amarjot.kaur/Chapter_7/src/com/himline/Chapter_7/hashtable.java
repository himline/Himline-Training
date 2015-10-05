package com.himline.Chapter_7;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class hashtable {

	public static void main(String[] args) {
		//create HashMap
		HashMap map = new HashMap();
		map.put("1","one");
		map.put("2","two");
		map.put("3","three");
		
		//create new Hashtable
		Hashtable ht = new Hashtable();
		ht.put("1","This value would be replaced !!");
		ht.put("4","four");
		System.out.println("Hashtable contents before copy");
		Enumeration e = ht.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		ht.putAll(map);
		System.out.println("Hashtable contents after copy");
		e = ht.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
	}

}
