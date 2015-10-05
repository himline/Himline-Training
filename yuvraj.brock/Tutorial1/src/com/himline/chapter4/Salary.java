package com.himline.chapter4;

class Salary {
	public static void main(String[] args) {
		int numOfPets = 5;
		String status = (numOfPets < 4) ? "Pet limit not exceeded" : "too many pets";
		System.out.println("This pet status is " + status);
	}
}
