package com.himline.practice;

public  class Car extends Vechile
{
	 public void fuel(){
		 System.out.println("must to use fuel");
		 
	 }
	 public  void brake(){
		 System.out.println("must to have break");
		 
	 }
	
	
public static void main(String[] args) {
	Car c1 =new Car();
	c1.fuel();
	c1.brake();

	}

}

