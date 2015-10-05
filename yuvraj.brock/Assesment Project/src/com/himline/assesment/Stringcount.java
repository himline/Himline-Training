package com.himline.assesment;

public class Stringcount {
	public static void main(String[] args) {

		String str = "abcdcabcdacbdadbbbbca";

		String findStr = "b";
		int lastIndex = 0;
		int count = 0;

		while (lastIndex != -1) {

			lastIndex = str.indexOf(findStr, lastIndex);

			if (lastIndex != -1) {
				count++;
				lastIndex += findStr.length();
				System.out.println(count  +"            "+lastIndex);
			}
		}
		System.out.println(count);
	}
}
