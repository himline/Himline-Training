package com.himline.Chapter_9;

public class TestThread {
	public static void main(String[] args) {
		FooRunnable r = new FooRunnable();
		Thread t = new Thread(r);
		t.setName("Jot");
		t.start();	
	}

}
