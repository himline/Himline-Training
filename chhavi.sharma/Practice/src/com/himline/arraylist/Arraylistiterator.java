package com.himline.arraylist;
import java.util.*;

public class Arraylistiterator {
	
	  public static void main(String args[])
	  {   
	    ArrayList<String> a1 = new ArrayList<String>();
	    a1.add("Rupal");
	    a1.add("Chhavi");
	    a1.add("Anshu");
	    a1.add("Amarjot");
	    a1.add("Yuvraj");
	 
	    // using set method
	    System.out.println("Elements before set: " + a1);
	    a1.set(1, "Ganga"); // replaces the original string value "chhavi" with "Ganga"
	    System.out.println("Elements after set: " + a1);
	    
	     // using sublist method
	    List<String> a2 = a1.subList(0,4); // the list a2 contains the elements 1 and 2 ( 4-0) of al1
	    System.out.println("\nElements of sublist a2: " + a2);
	    
	    // using addall method
	    ArrayList<String> al3 = new ArrayList<String>();
	    al3.addAll(a2);
	    System.out.println("\nElements of al3: " + al3);
	 
	                                 // ITERATING WITH ITERATOR
	    System.out.print("\nElements with Iterator: ");
	    Iterator it1 = a1.iterator(); // it1 contains all the elements of a1
	    while(it1.hasNext())
	    {
	      System.out.print(it1.next() + " ");
	    }
	                                 // ITERATING WITH LISTITERATOR
	    System.out.print("\nElements with ListIterator: ");
	    ListIterator it2 = a1.listIterator(2); // it1 contains all the elements of a1 
	    while(it2.hasNext())
	    {
	      System.out.print(it2.next() + " ");
	    }
	  }
}
	   
