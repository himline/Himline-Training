package com.himline.chapter3;

import java.util.Date;

public class CheckGc {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total JVM memory: " + rt.totalMemory());

		System.out.println("Before Memory = " + rt.freeMemory());
		Date d = null;
		for (int i = 0; i < 10000; i++) {
			d = new Date();
			long creditcard=123455667;
			
			d = null; // you put this in dustbin  - memory leak is possible
		}
		System.out.println("After Memory = " + rt.freeMemory());
		rt.gc(); // an alternate to System.gc() // dustbin throw - 
		System.out.println("After GC Memory = " + rt.freeMemory());
	}
}
