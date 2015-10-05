package com.himline.day2;

public class ConcateString {

	public static void main(String[] args) {
		String s1 ="gagan";
		String s2 = "jot";
        String s3 = "gaganjottt";
        String s4 = new String();
        String s5 = s1+s2+s3;
        String s6 = s1.concat(s2);
        String s7 = s5.concat(s6);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
	}

}
