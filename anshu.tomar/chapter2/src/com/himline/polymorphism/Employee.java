package com.himline.polymorphism;

public class Employee {
	private String name;
	private String address;
	private int number;
	
	public Employee(String name, String address, int number)
	{
		System.out.println("constructing an Employee");
		this.name= name;
		this.address =address;
		this.number =number;
	}
	public void mailCheck()
	{
		System.out.println("Mailing a check to "+ this.name+ " "+ this.address);
	}
	public String tostring()
	{
		return name + " " + address + " "+ number;
	
	}
	public String getname()
	{
	return name;
	}
	public String getaddress()
	{
		return address;
	}
    public void setAddress(String newaddress)
    {
    	address =newaddress;
    }
    public int getnumber()
    {
    	return number;
    }
    
}
