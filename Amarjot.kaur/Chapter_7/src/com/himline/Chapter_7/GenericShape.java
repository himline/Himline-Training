package com.himline.Chapter_7;

abstract class GenericShape {
	abstract void draw();
}

class Rectangle extends GenericShape {

	@Override
	void draw() {
		System.out.println("drawing rectangle");
	}
}
	class circle extends GenericShape {
		void draw() {
			System.out.println("drawing circle");
		}

	}
