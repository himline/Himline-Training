package com.himline.day2;

	import java.io.*;
	public class FileToFile1
	{
	  public static void main(String args[]) throws IOException
	  {
//		  File file = new File ("amarjot");
//		  boolean x = file.createNewFile();
//		  FileWriter fw = new FileWriter (file);
//		  fw.write("amarr\njot\n");
//		  fw.flush();
//		  fw.close();
	    try
	    {  
	      FileInputStream fis = new FileInputStream("xyz.txt");
	      FileOutputStream fos = new FileOutputStream("amarjot");
	       
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

