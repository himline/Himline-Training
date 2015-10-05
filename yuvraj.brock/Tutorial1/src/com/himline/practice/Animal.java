package com.himline.practice;

public abstract class Animal {
	protected int weight = (Integer) 25;
	private String size;

	protected abstract void shape();

	public void size(String size) {
		this.size(size);
	}

	// public String getSize() {
	// return size;
	// }
	//
	// public void setSize(String size) {
	// this.size = size;
	// }
}

class Dog extends Animal {

	public void size(String size) {
		System.out.println(size);
		return;
	}

	protected void shape() {
		weight = 5;
		System.out.println("tibetan mastiff     " + weight);

	}

}

class Horse extends Animal {
	public void size(String size) {

		System.out.println(size);
		return;
	}

	protected void shape() {
		weight = 10;
		System.out.println("kashmiri     " + weight);

	}

}
