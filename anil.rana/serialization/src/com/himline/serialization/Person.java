package com.himline.serialization;

import java.io.Serializable;

public class Person implements Serializable {

	private String firstName, lastName, PAN, aadharCard, mobile;
	Address personAddress;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPAN() {
		return PAN;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public String getMobile() {
		return mobile;
	}
	
	public void getPersonAddress(){
		personAddress.getAddress();
	}

	public void getPersonInfo() {
		System.out.println("Name: " + getFirstName() + " " + getLastName());
		System.out.println("PAN No.: " + getPAN());
		System.out.println("Aadhar Card No.: " + getAadharCard());
		System.out.println("Mobile No.: " + getMobile());
		getPersonAddress();
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPAN(String PAN) {
		this.PAN = PAN;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void setPersonAddress(Address personAddress){
		this.personAddress = personAddress;
	}

}
