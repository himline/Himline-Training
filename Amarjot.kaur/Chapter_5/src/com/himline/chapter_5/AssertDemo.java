package com.himline.chapter_5;

public class AssertDemo {

	public static void main(String[] args) {
		AssertDemo d = new AssertDemo();
		d.isAgeValid(30);
		
	}
	public boolean isAgeValid(int age) {
		assert(age < 150) : "age entered is" + age;
		if (age > 0) {
			return true;
		} else {
			return false;
		}
	}
}
