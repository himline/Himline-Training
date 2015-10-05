package com.himline.chapter6;

import java.util.Date;

class TestDates {
	public static void main(String[] args) {
		Date d1 = new Date(1000000000000L); // a trillion!
		System.out.println("1st date " + d1.toString());
	}
}
