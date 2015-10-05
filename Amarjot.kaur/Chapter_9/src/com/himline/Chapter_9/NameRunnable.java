package com.himline.Chapter_9;

class NameRunnable implements Runnable {
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Run by " + Thread.currentThread().getName() + ",i is " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ex) {
			}
		}
	}
}
