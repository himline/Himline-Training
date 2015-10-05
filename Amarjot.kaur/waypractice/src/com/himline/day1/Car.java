//interface 
package com.himline.day1;

interface vehicle {
	public abstract void start();

	public abstract void engine();

	public abstract void Brakes();
}

public class Car implements vehicle {
	public void start() {
		System.out.println("started");
		
	}

	public void engine() {
		System.out.println("Every car is powered by an engine");
	}

	public void Brakes() {
		System.out.println("its most important safety features");
	}
	
}
//	public static void main(String[] args) {
//		car c = new car();
//		c.start();
//		c.engine();
//		c.Brakes();
//
//	}

class Bike implements vehicle{

	@Override
	public void start() {
		System.out.println("start bike");
	}

	@Override
	public void engine() {
		System.out.println("bike engine");
	}

	@Override
	public void Brakes() {
		System.out.println("engine");
	}
	
}
