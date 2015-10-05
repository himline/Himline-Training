package com.himline.chapter_5;

public class clsBreakContinue {
	public static void main(String[] args) {
		boolean isTrue = true;
		outer:
		for(int i=0 ; i < 5 ; i++){
			while(isTrue){
				System.out.println("Hello");
				break outer;
			}
			System.out.println("Outer loop.");
				
		}
		System.out.println("Good-Bye");
		outerr:
			for(int j=0 ; j < 5; j++){
			System.out.println("Helloooooo");
			continue outerr;
			}
		System.out.println("good bye");
			
	}
}
