package com.himline.day2;

	import java.util.*;
	public class HashtableGeneral
	{
	  public static void main(String args[])
	  {
	    Hashtable ht = new Hashtable();   
	     //put elements to the hashtable
	    ht.put("apple", "red");
	    ht.put(10, 20);
	    ht.put("birthday", new Date());   
	    ht.put("interest", 200.5);

	    System.out.println("apple value before overriding: " + ht.get("apple"));

	    ht.put("apple", "green");    
	    System.out.println("apple value after overriding: " + ht.get("apple"));

	    System.out.println("Key birthday exists: " + ht.containsKey("birthday"));
	    System.out.println("Value 200.5 exists: " + ht.contains(200.5));

	    System.out.println("\nPrinting keys and values with Enumeration:");
	    Enumeration e = ht.keys();
	    while(e.hasMoreElements())
	    {
	      Object k = e.nextElement();
	      Object v = ht.get(k);
	      System.out.println(k + " : " + v );
	    } 
	   }
	}

