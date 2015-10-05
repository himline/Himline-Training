package com.himline.Testcode;

public class StringndStringBuffer {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = s1;
		s1 += "de";
		System.out.println(s1 + "  " + s2 + "     " + (s1 == s2));
		StringBuffer sb1 = new StringBuffer("amar"); 
		StringBuffer sb2 = sb1;
		sb1.append("jot");
		System.out.println(sb1 + "  " + sb2 + "     " + (sb1 == sb2));
	}
}
