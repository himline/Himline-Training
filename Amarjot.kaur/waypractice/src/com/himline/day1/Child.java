//Abstract class
package com.himline.day1;

abstract class parent {
	public abstract void eat();

	public abstract void dance();

	public void bodymoment() {
		System.out.println("bodymoment");
	}
}

public class Child extends parent {
	public void eat() {
		System.out.println("eatig food");
	}

	public void dance() {
		System.out.println("dancing");
	}

	public static void main(String[] args) {
		Child ch = new Child();
		ch.eat();
		ch.dance();
		ch.bodymoment();

	}

}
