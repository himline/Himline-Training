package com.himline.Chapter_7;

abstract class Animals {
	public abstract void checkup();
}

class Dog extends Animals {
	public void checkup() { 
		System.out.println("Dog checkup");
	}
}

class Cat extends Animals {
	public void checkup() { 
		System.out.println("Cat checkup");
	}
}

class Bird extends Animals {
	public void checkup() { 
		System.out.println("Bird checkup");
	}
}
