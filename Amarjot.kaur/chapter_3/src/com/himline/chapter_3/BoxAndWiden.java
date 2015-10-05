package com.himline.chapter_3;

public class BoxAndWiden {
	static void go(Object o) {
		Byte b2 = (Byte) o; // ok - it's a Byte object
		System.out.println(b2);
		}
		public static void main(String [] args) {
		byte b = 5;
		go(b); // can this byte turn into an Object ?
		}
}
