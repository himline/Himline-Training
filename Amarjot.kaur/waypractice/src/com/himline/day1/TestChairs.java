package com.himline.day1;

public class TestChairs {

	public static void main(String[] args) {
		Chairs ch = new Chairs();
		Chairs ln = new longchair();
		Chairs shc = new shortchair();
		ch.sit();
		ch.armchair();
		//ch.rest();
	    ln.sit();
	    ln.armchair();
	    shc.sit();
	    shc.armchair();
	}

}
