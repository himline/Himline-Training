package com.himline.practice;

import java.io.Serializable;

public class Persondetails implements Serializable{
	public String Name;
	public int HouseNo;
	public long PhoneNO;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getHouseNo() {
		return HouseNo;
	}
	public void setHouseNo(int houseNo) {
		this.HouseNo = houseNo;
	}
	public long getPhoneNO() {
		return PhoneNO;
	}
	public void setPhoneNO(int phoneNO) {
		this.PhoneNO = phoneNO;
	}	
	
}
