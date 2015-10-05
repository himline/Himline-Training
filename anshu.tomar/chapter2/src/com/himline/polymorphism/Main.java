package com.himline.polymorphism;

public class Main {

	public static void main(String[] args) 
	{
		  Salary s = new Salary("Anshu tomar", "kurukshetra, haryana", 3, 5000.00);
	      Employee e = new Salary("rohit sharma", "kurukshetra, haryana", 2, 5000.00);
	      System.out.println("Call mailCheck using Salary reference --");
	      s.mailCheck();
	      System.out.println("\n Call mailCheck using Employee reference--");
	      e.mailCheck();
	}

}
