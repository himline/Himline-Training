package com.himline.chapter3;

import java.util.Date;

public class GarbageFactory {
	public static void main(String[] args) {
		Date d = getDate();
		doComplicatedStuff();
		System.out.println("d = " + d);
	}

	private static void doComplicatedStuff() {
		// TODO Auto-generated method stub
		
	}

	public static Date getDate() {
		Date d2 = new Date();
		StringBuffer now = new StringBuffer(d2.toString());
		System.out.println(now);
		return d2;
	}
}
