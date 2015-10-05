package com.himline.chapter2;

public class Overload {

	String name;

	Overload(String name) {
		this.name = name;
	}

	Overload() {
		this(makeRandomName());
	}

	static String makeRandomName() {
		int x = (int) (Math.random() * 5);
		String name = new String[] { "Fluffy", "Fido", "Rover", "Spike", "Gigi" }[x];
		return name;
	}

	public static void main(String[] args) {
		Overload a = new Overload();
		System.out.println(a.name);
		Overload b = new Overload("Zeus");
		System.out.println(b.name);
	}
}
