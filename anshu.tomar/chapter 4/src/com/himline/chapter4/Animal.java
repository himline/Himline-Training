package com.himline.chapter4;

public class Animal {

	public static void main(String[] args) {
		String animal = "unknown";
		int weight = 700;
		char sex = 'm';
		double colorwavelength = 1.630;
		if (weight > 500) {
			animal = "elephant";
		}
		if (colorwavelength > 1.620) {
			animal = "gray" + animal;
		}
		if (sex <= 'f') {
			animal = "female" + animal;
		}
		System.out.println("The animal is a " + animal);
      
	}

}
