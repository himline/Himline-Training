package com.himline.day1;

public class Chairs {
	public void sit() {
		System.out.println("sit down");
	}

	public void armchair() {
		System.out.println("arm");
	}

	private void rest() {
		System.out.println("rest");
	}
}

class longchair extends Chairs {
	public void sit() {
		System.out.println("sitting");
	}

	public void armchair() {
		System.out.println("chair");
	}
}

class shortchair extends Chairs {
	public void sit() {
		System.out.println("sit");
	}

	public void armchair() {
		System.out.println("armchairrr");
	}
}
