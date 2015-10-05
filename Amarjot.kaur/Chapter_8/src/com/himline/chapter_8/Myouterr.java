package com.himline.chapter_8;

public class Myouterr {
    private int x = 5;
    public void Myinner(){
    	Myinner in = new Myinner();
    	in.seeouter();
    }
    class Myinner{
    	public void seeouter(){
    		System.out.println("outer x is =  " + x);
    		System.out.println("Inner class ref  " + this);
    		System.out.println("outer class ref  " + Myouterr.this);
    	}
    }
	public static void main(String[] args) {
		Myouterr.Myinner iner = new Myouterr().new Myinner();
		iner.seeouter();
		
	}

}
