package com.himline.chapter2;

public class Animall {
	
		public void eat() {
		System.out.println("Generic Animal Eating Generically");
		}
		
		public class Horse extends Animall {
		public void eat() {
		System.out.println("Horse eating hay ");
		}
		public void eat(String s) {
		System.out.println("Horse eating " + s);
		}
		}
}


