package com.himline.chapter2;

public class Animalll {
	
	class Horse extends Animalll { }
	class UseAnimals {
	public void doStuff(Animal animalObj) {
	System.out.println("In the Animal version");
	}
	public void doStuff(Horse h) {
	System.out.println("In the Horse version");
	}
	public void main (String [] args) {
	UseAnimals ua = new UseAnimals();
	Animal animalObj = new Animal();
	Horse horseObj = new Horse();
	ua.doStuff(animalObj);
	ua.doStuff(horseObj);
	}
	}
}
