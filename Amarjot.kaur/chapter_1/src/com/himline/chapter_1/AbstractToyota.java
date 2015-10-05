package com.himline.chapter_1;

public class AbstractToyota {
	public void fuel() {
		System.out.println("Must to use fuel");
	}

	public void brake() {
		System.out.println("Must to have brakes");
	}

	public static void main(String[] args) {
		AbstractToyota AT = new AbstractToyota();
		AT.fuel();
		AT.brake();
	}

}
