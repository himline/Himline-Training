package chapter7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListWithoutGenericsTest {
	   public static void main(String[] args) {
	      List<Comparable> strLst = new ArrayList<Comparable>();  // List and ArrayList holds Objects
	      strLst.add("alpha");            // String upcast to Object implicitly
	      strLst.add("beta");
	      strLst.add("charlie");
	      Iterator<Comparable> iter = strLst.iterator();
	      while (iter.hasNext()) {
	         String str = (String)iter.next(); // need to explicitly downcast Object back to String
	         System.out.println(str);
	      }
	      strLst.add(new Integer(1234));       // Compiler/runtime cannot detect this error
	     String str = (String) strLst.get(3);  // compile ok, but runtime ClassCastException
	   }
	}