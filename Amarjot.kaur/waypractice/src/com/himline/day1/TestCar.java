package com.himline.day1;

public class TestCar {

	public static void main(String args[]) {
		Car C1 = new Car();
		Bike b1 = new Bike();
		//Bike B2 = (Vehicle) C1;
		C1.start();
		C1.engine();
		C1.Brakes();
		b1.start();
		b1.engine();
		b1.Brakes();
	}

}
