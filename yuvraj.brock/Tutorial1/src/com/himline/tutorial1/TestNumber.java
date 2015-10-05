package com.himline.tutorial1;

public class TestNumber {

	public static void main(String[] args) {
		
		Person person = new Person();

		person.setLastName("Kumar");
		person.setFirstName("Sanjeev");

		System.out.println("Sanjeev");
		int x = 500;
		System.out.println(person.getFirstName() + " " + person.getLastName());

	}

}
