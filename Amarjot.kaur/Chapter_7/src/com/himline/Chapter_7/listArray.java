package com.himline.Chapter_7;

import java.awt.List;
import java.util.ArrayList;

public class listArray {
	public static void main(String[] args) {
		ArrayList<String> test = new ArrayList<String>();
		String s = "hi";
		test.add("string");
		test.add(s);
		test.add(s+s);
		System.out.println(test.size());
		System.out.println(test.contains(42));
		System.out.println(test.contains("hihi"));
		test.remove("hi");
		System.out.println(test.size());
	}
}
