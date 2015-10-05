package com.himline.serialization;

import java.io.Serializable;

public class Address implements Serializable {
	
	private String flatNumber, streetName, cityName, stateName, countryName;
	
	public Address(String flatNumber, String streetName, String cityName, String stateName,String countryName){
		setFlatNumber(flatNumber);
		setStreetName(streetName);
		setCityName(cityName);
		setStateName(stateName);
		setCountryName(countryName);
	}
	
	public String getFlatNumber(){
		return flatNumber;
	}
	
	public String getStreetName(){
		return streetName;
	}
	
	public String getCityName(){
		return cityName;
	}
	
	public String getStateName(){
		return stateName;
	}
	
	public String getCountryName(){
		return countryName;
	}
	
	public void getAddress(){
		System.out.println("Flat No.: " + getFlatNumber());
		System.out.println("Street: " + getStreetName());
		System.out.println("City: " + getCityName());
		System.out.println("State: " + getStateName());
		System.out.println("Country: " + getCountryName());
	}
	
	public void setFlatNumber(String flatNumber){
		this.flatNumber = flatNumber;
	}
	
	public void setStreetName(String streetName){
		this.streetName = streetName;
	}
	
	public void setCityName(String cityName){
		this.cityName = cityName;
	}
	
	public void setStateName(String stateName){
		this.stateName = stateName;
	}
	
	public void setCountryName(String countryName){
		this.countryName = countryName;
	}
		
}
