package com.himline.objectorientation;

public class Encapsulation {
	
	private String firstName;
	private String lastName;
	private String companyName;
	private String place;
	private int age;

	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
		
	}
	
	public String getCompanyName(){
		return companyName;
	}
	
	public String getPlace(){
		return place;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setFirstName(String newFirstName){
		firstName= newFirstName;
	}

	public void setLastName(String newLastName){
		lastName= newLastName;
	}
	
	public void setCompanyName(String newCompanyName){
		 companyName= newCompanyName;
	}

	public void setPlace(String newPlace){
		 place= newPlace;
	}
	
	public void setAge(int newAge){
		age= newAge;
		
	}
	
	
}
