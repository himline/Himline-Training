package com.himline.chapter_8;

public class Broom {
	static class nest2{
		public void go2(){
			System.out.println("Hey amarjot");
		}
	}

	public static void main(String[] args) {
		BigOuter.Nest bn = new BigOuter.Nest();
		nest2 n2 = new nest2();
		bn.go();
		n2.go2();
	}

}
