package com.himlinestr;

import java.io.*;

public class Filetofile1 {
	
	
	  public static void main(String args[])
	  {
	    try
	    {  
	    	class FileToFile1
	    	{
	    	  public void main(String args[])
	    	  {
	    	    try
	    	    {  
	    	      FileInputStream fis = new FileInputStream("pqr.txt");
	    	      FileOutputStream fos = new FileOutputStream("xyz.txt");
	    	       
	    	      int k;
	    	      while( ( k = fis.read() ) != -1 )
	    	      {
	    	        fos.write(k);   		
	    	        System.out.print((char) k);  
	    	      }
	    	      fos.close();
	    	      fis.close();
	    	    }
	    	    catch(FileNotFoundException e)
	    	    {
	    	      System.out.println("File does not exist. " + e);
	    	    }
	    	    catch(IOException e)
	    	    {
	    	      System.out.println("Some I/O problem. " + e);
	    	    }
	    	   }
	    	}
	      
	      
	      int k;
	      while( ( k = fis.read() ) != -1 )
	      {
	        fos.write(k);   		
	        System.out.print((char) k);  
	      }
	      fos.close();
	      fis.close();
	    }
	    catch(FileNotFoundException e)
	    {
	      System.out.println("File does not exist. " + e);
	    }
	    catch(IOException e)
	    {
	      System.out.println("Some I/O problem. " + e);
	    }
	   }
	}


