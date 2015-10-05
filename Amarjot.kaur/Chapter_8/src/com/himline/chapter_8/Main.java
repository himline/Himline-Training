package com.himline.chapter_8;

class MyOuter {
	private int x = 7;

	class MyInner {
		private int ans;

		public void getvalue() {
			display();
			accessInner();
			System.out.println("outer x is =  " + x);
		}
	}

	public void display() {
		System.out.println("Display outer class ");
	}

	public void accessInner() {
		MyInner obj = new MyInner();
		obj.ans = 500;
		System.out.println("Inner class value: " + obj.ans);
	}
}

public class Main {
	public static void main(String[] args) {
		MyOuter objouter = new MyOuter();
		System.out.println("outer  "+objouter);
		MyOuter.MyInner inoj = objouter.new MyInner();
		System.out.println("inner  "+inoj);
		inoj.getvalue();
	}

}
