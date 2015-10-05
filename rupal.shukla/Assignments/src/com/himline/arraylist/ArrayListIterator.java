package com.himline.arraylist;
import java.util.*;

public class ArrayListIterator {

	public static void main(String[] args) {
       // object creation
		ArrayList<String>al1 = new ArrayList<String>();
		al1.add("rupal");
		al1.add("shukla");
		al1.add("pavni");
		al1.add("shukla");

		 System.out.println("Elements in the list before add = " + al1.isEmpty());
		 System.out.println("Elements in the list = " + al1.size());
		 System.out.println("Elements before set: " + al1);
		 al1.set(2, "pari");
		 System.out.println("Elements after set = "+ al1);
		 al1.remove(1);
		 System.out.println("Elements after remove = " + al1);
		 
		 
		
		// another object creation integer type
		 ArrayList<Integer> al2 = new ArrayList<Integer>();
		 al2.add(10);
		 al2.add(20);
		 al2.add(30);
		 
		 System.out.println("Elements in the list = " + al2);
		 
		 
		 ArrayList al3 = new ArrayList();
		 System.out.println("Elements in the list before adding = " + al3);
		 al3.addAll(al2); //adding al2 in al3
		 System.out.println("Elements in the list after adding al2 = " + al3);
		 al3.addAll(al1); // adding al1 in al3
		 System.out.println("Elements in the list after adding al3 = " + al3);
		 // after adding both
		 
		 System.out.println("Elements in the list =" + al3.size());
		 //OPERATIONS
		 System.out.println("\nMax of al1: " + Collections.max(al1));
		 System.out.println("Min of al1: " + Collections.min(al1));
		 System.out.println("\nMax of al1: " + Collections.max(al2));
		 System.out.println("Min of al1: " + Collections.min(al2));
		 System.out.println("\nOriginal elements: " + al1); 
		  
		 Collections.swap(al3, 1, 3); // SWAPING OPERATION
		 System.out.println("Elements after swap 1 and 3: " + al1); 
		 
		 Collections.reverse(al3);
		 System.out.println("Reversed elements: " + al3); 
		   
		 Collections.shuffle(al3);
		 System.out.println("\nFirst time shuffled elements: " + al3); 
		 Collections.shuffle(al3);
		 System.out.println("Second time shuffled elements: " + al3); 
		 
		 
		
		 // ITERATING WITH ITERATOR
		 System.out.print("\nElements with Iterator: ");
		    Iterator it1 = al1.iterator();
		    while(it1.hasNext())
		    {
		      System.out.print(it1.next() + " ");
		    }
		    
		 // ITERATING WITH BAISC FOR LOOP
		    System.out.print("\n\nElements with basic for loop: ");
		    for(int i = 0; i < al3.size(); i++)
		    {
		      System.out.print(al3.get(i) + " ");  
		    
		    
		 }
           
		    // CLONING 	
		    ArrayList al4 = (ArrayList) al1.clone();
		    System.out.println("Cloned al3 elements: " + al3);
		    
		    //CLEAR
		    al3.clear();
		    System.out.println("Elements in the list after clear = " + al3.size());
		    
		    

	}
}
