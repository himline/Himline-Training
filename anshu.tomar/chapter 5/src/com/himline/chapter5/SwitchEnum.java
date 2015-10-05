package com.himline.chapter5;

enum color {red,blue,white,orange}
public class SwitchEnum {

	public static void main(String[] args) {
	
		color c = color.red;
		switch(c){
		case red:
			System.out.println("red");
		case blue:
			System.out.println("blue");
		case white:
			System.out.println("white");
		case orange:
			System.out.println("orange");
		default:
			System.out.println("done");
		}
		

	}

}
