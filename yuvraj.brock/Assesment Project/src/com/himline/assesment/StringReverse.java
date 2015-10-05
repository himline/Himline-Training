package com.himline.assesment;

public class StringReverse {
static String st1 = "HELLO";
static String st2 = "";
	public static void main(String[] args) {
		for(int i = st1.length()-1; i>= 0 ; --i  ){
			st2 += st1.charAt(i);
			
		}
		System.out.println(st2);
	}

}
