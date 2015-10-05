package com.himline.chapter1;

class Animal {

	public void move() {
		System.out.println("animal can move");

	}

	public void sound() {
		System.out.println("animal can sound");

	}

	public void color() {
		System.out.println("color");
	}

	class dog extends Animal {
		public void move() {
			System.out.println("dog can walk and run");
		}

		public void sound() {
			System.out.println("dog can woof");
		}

		public void color() {
			System.out.println("white");
		}

		class horse extends Animal {
			public void move() {
				System.out.println("horse can runs very fast");
			}

			public void sound() {
				System.out.println("horse can bark");
			}

			public void color() {
				System.out.println("white");
			}
		}
	}
}
