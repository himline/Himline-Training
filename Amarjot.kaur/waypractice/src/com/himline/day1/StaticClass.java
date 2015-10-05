//Static keyword
package com.himline.day1;

public class StaticClass {
	static int x = 10; // Static integer variable
	String a; // Non-Static String variable

	public static void main(String[] args) {
		StaticClass sc1 = new StaticClass();
		StaticClass ac2 = new StaticClass();
		sc1.x = 12;
		sc1.a="hello";
		ac2.a="jot";
		System.out.println("sc integer:"+sc1.x);
	    System.out.println("sc String:"+sc1.a);
	    System.out.println("ac integer:"+ac2.x);
	    System.out.println("ac STring:"+ac2.a);
	}

}
