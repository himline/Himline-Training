package com.himline.chapter3;

public class GarbageTruck {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb);
		// The StringBuffer object is not eligible for collection
		sb = null;
		// Now the StringBuffer object is eligible for collection
	}
}