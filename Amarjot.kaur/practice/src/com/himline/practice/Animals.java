package com.himline.practice;

public abstract class Animals {
	public void Move() {
		System.out.println("animal is running ");
	}

	public void Sound() {
		System.out.println("animal sound");
	}
}

class Horse extends Animals {
	public Horse() {
		super();
		System.out.println("A new Horse has been created");
	}

	@Override
	public void Move() {
		System.out.println("Galping");
	}

	@Override
	public void Sound() {
		System.out.println("Horse Sound");
	}

}

class Dog extends Animals {
	public Dog() {
		super();
		System.out.println("A new Dog has been created");
	}

	@Override
	public void Move() {
		System.out.println("Running");
	}

	@Override
	public void Sound() {
		System.out.println("Bark");
	}

	public void height() {
		System.out.println("height = 52");
	}
}





