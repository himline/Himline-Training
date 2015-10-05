package assigne.himline.com;

public class Immuatable {
	
		  public static void main(String args[])
		  {
		    String s1 = "Mario";
		    String s2 = "Mario";
		 
		    String s3 = new String("lord");
		    String s4 = new String("lord");
		 
		    System.out.println(s1 == s2); // true
		    System.out.println(s3 == s4);  // false    
		    
		    String s31 = new String("lord");
		    String s41 = new String("lord");
		 
		 
		    System.out.println(s1.equals(s2)); // true
		    System.out.println(s31.equals(s41)); // true
			
		    s2 = "world";
		    System.out.println(s1 == s2); // false
		 
		    String s5 = "mario";
		    System.out.println(s1.equals(s5)); // false
		 
		    System.out.println(s1.equalsIgnoreCase(s5));    // true
		    System.out.println(s1.length());          // prints 4
		 }
		}

