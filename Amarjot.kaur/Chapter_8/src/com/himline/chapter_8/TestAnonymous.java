package com.himline.chapter_8;

public class TestAnonymous {
	static AnonymousClass an = new AnonymousClass() {
		public void dostuff() {
			System.out.println("hello Anonymous");
		}
	};
	public static void main(String[] args) {
		an.dostuff();
	}

}
