package com.himline.Vector;

import java.util.*;

public class Vectordemo {

	
 public static void main(String[] args) {
	                                       
	 // create Vectors      
	   Vector<Integer> vect = new Vector();
	   Vector<String> vect1 = new Vector();
	   
       
	   // vect store only integer
	         vect.add(4);
	         vect.add(3);
	         vect.add(2);
	         vect.add(1);
	         
	    //vect1 store only strings
	         Vector<String> vect2 = new Vector<String>();
	         vect1.add("zero");
	         vect1.add("one");
	         vect1.add("two");
	         vect1.add("three");
	         vect1.add("four");
	         vect1.add("five");
	         vect1.add("six");
	         
	         // use swap method
	         System.out.println("Original values vect1" + vect1);
	         Collections.swap(vect1, 2, 4); //  in the place of 2 four comes and in 4 place 2 comes
	         System.out.println("After swapping 2 and 4: " + vect1);
	          
	         
	         // max(vect) returns the maximum value element in vect
	         System.out.println("Maximum value of vect" + Collections.max(vect));
	         //  max(vect1) returns the maximum value element in vect1
	         System.out.println("Maximum value of vect1 " + Collections.max(vect1));
	        //  min(vect) returns the minimum value element in vect
	         System.out.println("Minimum value of vect " + Collections.min(vect));
	       //  min(vect1) returns the minimum value element in vect1
	         System.out.println("Minimum value of vect1" + Collections.min(vect1));
	         
	        // create new vector
	         Vector<Integer> vect3 = new Vector<Integer>();
	         vect3.add(50);
	         vect3.add(60);
	         vect3.add(70);
	         vect3.add(80);
	         System.out.println("Original values vect3: " + vect);
	         vect3.addAll(vect); // All the elements of vector vect3 are added to vect
	         System.out.println("After adding vect3 to vect, vect values " + vect);
	         
	         
	          // use reverse method
	         Collections.reverse(vect3);  // All the elements of vect3 are reversed.
	         System.out.println("Reversed values vect3: " + vect3);
	         
	         // use shuffle method    
	         System.out.println("Original values vect1" + vect1);
	         Collections.shuffle(vect1);
	         System.out.println("1st Shuffling vect1" + vect1);
	         Collections.shuffle(vect1);
	         System.out.println("2nd Shuffling vect1" + vect1);
	      
	         // use rotate method
	         Collections.rotate(vect1, 3); //  rotates the elements of vect1 
	         System.out.println("vect1 values after rotating: " + vect1);
	      
	         // use  clear method
	         vect1.clear(); // The clear() method removes all the elements. Now the size becomes zero.
	         System.out.println("vect1 size after calling clear(): " + vect1.size());
	      
	        
	      }
	     }    
	         
	         
	        
	         
	         
	         
	         
 
 

	   
	
  
           
        



        

