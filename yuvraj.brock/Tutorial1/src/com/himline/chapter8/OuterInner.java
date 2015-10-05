package com.himline.chapter8;

public class OuterInner {
	private static Integer x = 2;

	void showouter() {
		class inner {
			void innerclass() {
				
			}
		}
		
	}
	public static void main(String[] args){
		System.out.println(x);
	}
}
