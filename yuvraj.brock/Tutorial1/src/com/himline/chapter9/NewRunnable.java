package com.himline.chapter9;

class NameRunnable implements Runnable {
	public void run() {
		for (int x = 1; x <= 3; x++) {
			System.out.println("Run by "
					+ Thread.currentThread().getName());
			try {
				Thread.sleep(10000);
				} catch (InterruptedException ex) { }
		}
	}
}


