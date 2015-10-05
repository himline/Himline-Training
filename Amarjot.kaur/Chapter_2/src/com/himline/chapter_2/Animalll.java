package com.himline.chapter_2;

public class Animalll {

		static void doStuff() {
		System.out.print("a ");
		}
		}
		class Dog extends Animalll {
		static void doStuff() { // it's a redefinition,
		// not an override
		System.out.print("d ");
		}
		public static void main(String [] args) {
		Animalll [] a = {new Animalll(), new Dog(), new Animalll()};
		for(int x = 0; x < a.length; x++)
		Animalll.doStuff(); // invoke the static method
		}
		}	
	

