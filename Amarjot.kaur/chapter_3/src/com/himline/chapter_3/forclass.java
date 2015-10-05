package com.himline.chapter_3;

public class forclass {
	static String[] str = { "abc" };

	public static void main(String[] args) {
		for (String st : str) {
			for (int j = 0; j < 5; j++) {

				System.out.println(st + "value" + j);
			}
		}
	}
}
