package com.himline.Chapter_9;

class FooRunnable implements Runnable{
	public void run(){
		//for(int x=0 ; x<6 ; x++){
			System.out.println("Runnable Running");
			System.out.println("Run by "+ Thread.currentThread().getName());
		//}
	}

}
