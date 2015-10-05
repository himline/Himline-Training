package com.himline.chapter5;

public class classdefault {
	static int x = 9;
public static void main(String[] args){
	switch (x) {
	case 2:
	case 4:
	case 6:
	case 8:
	case 10: {
	System.out.println("x is an even number");
	break;
	}
	default: System.out.println("x is an odd number");
	}
}
}
