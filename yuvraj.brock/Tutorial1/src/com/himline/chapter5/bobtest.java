package com.himline.chapter5;

public class bobtest {
	String amarjot;
	String yuvraj;
	bobtest(){
		System.out.println(String.valueOf(amarjot).compareTo(yuvraj));
	}
public static void main(String [] args){
	
	Bob b = new Bob("hello", 20);
	System.out.println(b);
}
}
