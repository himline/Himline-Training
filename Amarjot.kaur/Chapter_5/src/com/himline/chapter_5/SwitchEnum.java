package com.himline.chapter_5;
enum Color {red, green, blue}
public class SwitchEnum {
	public static void main(String [] args) {
		Color c = Color.green;
		switch(c)
		{
		case red:
			System.out.println("the color is red");
			break;
		case green:
			System.out.println("the color is green");
			break;
		case blue:
			System.out.println("the color is blue");
			break;
		default:
			System.out.println("done");
			
		}	
	}
}
