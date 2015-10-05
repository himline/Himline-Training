package com.himline.chapter_3;

public class Collar {
	 }	
	 class Dog {
	 Collar c; // instance variable
	 String name; // instance variable
	 
	 public static void main(String [] args)
	 {	
	 Dog d; 
	 d = new Dog();
	 d.go(d);
	 }
	 
	 void go(Dog dog) 
	 { 
	 c = new Collar();
	 dog.setName("Aiko");
	 }
	 
	 void setName(String dogName) 
	 { 
	 name = dogName;	 
	 }
	 }
	

