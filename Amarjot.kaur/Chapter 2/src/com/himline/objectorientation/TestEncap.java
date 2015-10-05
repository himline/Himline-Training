package com.himline.objectorientation;

public class TestEncap {

	public static void main(String[] args) {
		Encapsulation encap = new Encapsulation();
		encap.setFirstName("Rupal");
		encap.setLastName("shukla");
		encap.setCompanyName("Himline internet pvt ltd");
		encap.setPlace("Chandigarh");
		encap.setAge(20);

		System.out.println("FirstName: " + encap.getFirstName());
		System.out.println("LastName: " + encap.getLastName());
		System.out.println("CompanyName:" + encap.getCompanyName());
		System.out.println("Place:" + encap.getPlace());
		System.out.println("Age:" + encap.getAge());

	}

}
