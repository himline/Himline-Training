package com.himline.day2;

import java.util.Scanner;

public class CheckingKeyboardInput
{
  public static void main(String[] args)
  {
    Scanner scanf = new Scanner(System.in);
    System.out.println("Please enter some value you like: ");
   
    if(scanf.hasNextInt())  //if you enter integer then run this block
    {
      double x = scanf.nextInt();
      System.out.println("You entered: " + x);
    }
    else if(scanf.hasNextDouble()) //if you enter double then run this block
    {
      double y  = scanf.nextDouble();
      System.out.println("You entered: " + y);
    }
    else if(scanf.hasNextBoolean())  //if you enter boolean then run this block
    {
      boolean b = scanf.nextBoolean();
      System.out.println("You entered: " + b);
    }             
    else if(scanf.hasNext())
    {
      System.out.println("What you entered I assume as a word.\nYou entered: " + scanf.next());
    }
    scanf.close();
  }
}