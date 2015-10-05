package com.himline.chapter1;
interface Mammal 
{
	  String chambers = "4-chambered";
	  void offSpring();
	  void feed();
	  void blood(String str);
	}
	public class Nature implements Mammal
	{
	  public void offSpring()
	  {
	    System.out.println("Only 3 mammals lay eggs and others give birth to young ones");
	  }
	  public void feed()
	  {
	    System.out.println("Mammals feed the offspring with milk");
	  }
	  public void blood(String str)
	  {
	    System.out.println("Mammals are " + str + " and contains " + chambers + " heart");
	  }
	  public static void main(String args[])
	  {
	    Nature n1 = new Nature();
	    n1.offSpring();
	    n1.feed();
	    n1.blood("warm-blooded");
	  }
	}
