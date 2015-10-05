package com.himline.polymorphism;

public class Employee {
	private String name;
	private String address;
	private int EmpNumber;
	
	Salary salary ;
	
	public Employee(String name, String address, int EmpNumber )
	{
		System.out.println("Contructing an Employee");
		this.name = name;
	    this.address = address;
	    this.EmpNumber = EmpNumber;
	 }
	
	
	public Employee(String name, String addres, Salary salary)
	{
		System.out.println("Contructing an Employee");
		this.name = name;
		this.address = address;
	    this.EmpNumber = 5000;
	    this.salary = salary;
	 }
	public Employee(String name)
	{
		System.out.println("Contructing an Employee");
		this.name = name;
		this.address = "Chandigarh";
	    this.EmpNumber = 5000;
	 }
	  
	  
	public void mailCheck(){
	   System.out.println("Mailing a check to " + this.name + " " + this.address);
	}
	   
   public String toString(){
      return name + " " + address + " " + EmpNumber;
   }
  
   public String getName(){
      return name;
   }
   
   public String getAddress(){
      return address;
   }
  
   public void setAddress(String newAddress){
      address = newAddress;
   }
   
   public int getNumber(){
     return EmpNumber;
   }
	
}
