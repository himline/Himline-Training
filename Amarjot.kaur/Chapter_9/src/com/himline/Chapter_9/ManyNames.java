package com.himline.Chapter_9;

public class ManyNames {

	public static void main(String[] args) {
		NameRunnable nr = new NameRunnable();
		Thread one = new Thread(nr);
		Thread two = new Thread(nr);
		Thread three = new Thread(nr);
		one.setName("amarjot");
		two.setName("gagan");
		three.setName("yuvraj");
		one.setPriority(3);
		two.setPriority(2);
		three.setPriority(1);
		one.start();
		two.start();
		three.start();
	}
}
