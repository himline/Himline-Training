package com.himline.assesment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Removeduparray {


		 public static void main(String[] args) {
			 
			  // A string array with duplicate values
			   String[] data = { "E", "C", "B", "E", "A", "B", "E", "D", "B", "A" };
			 
			System.out.println("Original array         : " + Arrays.toString(data));
			 
			 List<String> list = Arrays.asList(data);
			 Set<String> set = new HashSet<String>(list);
			 
			  System.out.print("After removing duplicates: ");
			  String[] resarray= new String[set.size()];
			   set.toArray(resarray);
			 
			 for (String ele: resarray) {
			 
			 System.out.print(ele + ", ");
			 
			 }
			 
			}

	

}
