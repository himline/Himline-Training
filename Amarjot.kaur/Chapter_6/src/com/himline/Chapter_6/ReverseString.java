package com.himline.Chapter_6;

public class ReverseString {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abc");
		sb.append("def").reverse().insert(3, "---");
		System.out.println(sb);

	}

}
