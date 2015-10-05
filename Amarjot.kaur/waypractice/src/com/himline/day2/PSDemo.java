package com.himline.day2;

import java.io.*;
public class PSDemo
{
    public static void main(String args[])
   {
        PrintStream pstream = new PrintStream(System.err);
        pstream.println(100);	
        pstream.println("World");
        pstream.print(false);  
        pstream.println(new Double(10.5));
        
        System.out.println("Java is simple but ocean");
        System.err.println("Practice it carefully");   
      		
        pstream.close();
  }
}
