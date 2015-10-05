package com.himline.vector;

import java.util.*;

public class VectorMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// vector storing only ints
	    Vector<Integer> vect1 = new Vector<Integer>();
	    vect1.add(10);
	    vect1.add(20);
	    vect1.add(30);
	    vect1.add(40);
	    
	    // vector storing only strings
	    Vector<String> vect2 = new Vector<String>();
	    vect2.add("zero");
	    vect2.add("one");
	    vect2.add("two");
	    vect2.add("three");
	    vect2.add("four");
	    vect2.add("five");
	    vect2.add("six");
	    vect2.add("seven");
	    vect2.add("eight");
	    vect2.add("nine");
	    vect2.add("ten");
	 
	    List<String> numbersList = vect2.subList(1, 9);
	    System.out.println("Elements of subList: " + numbersList);

	    System.out.println("Original values vect2: " + vect2);
	    Collections.swap(vect2, 2, 4);
	    System.out.println("After swapping 2 and 4: " + vect2);
	 
	    System.out.println("Maximum value of vect1: " + Collections.max(vect1));
	    System.out.println("Minimum value of vect2: " + Collections.min(vect2));
	    
	    System.out.println("vect1 values before rotating: " + vect1);
	    Collections.rotate(vect1, 3);
	    System.out.println("vect1 values after rotating: " + vect1);
	    
	    System.out.print("Get 2nd element: " + vect1.get(2));  
	    System.out.print("\nElements: " + vect1);  // 
	    
	    
	    
	    System.out.print("\nElements with ListIterator: ");  // 
	    ListIterator it2 = vect1.listIterator(2);
	    while(it2.hasNext())
	    {
	      System.out.print(it2.next() + " ");
	    }
	    
	    // remove
	    vect1.remove(10.5);
	    System.out.print("\nElements with Iterator: ");// 
	    Iterator it1 = vect1.iterator();
	    while(it1.hasNext())
	    {
	      System.out.print(it1.next() + " ");
	    }
	}

}
