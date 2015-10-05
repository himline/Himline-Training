package com.himline.chapter3;

public class Book {
	private String title; // instance reference variable

	public String getTitle() {
		return title;
	}

	public static void main(String[] args) {
		Book b = new Book();
		String s = b.getTitle(); // Compiles and runs
		String t = s.toLowerCase(); // Runtime Exception!
	}
}