package com.himline.chapte2;

public class Apple {

	public static void main(String[] args) {
	 Test Testobject = new Test();
	 Test Testobject2 = new Test(11);
	 Test Testobject3 = new Test(11,22);
	 Test Testobject4 = new Test(11,22,33);
	 System.out.printf("%s\n", Testobject.toMilitary());
	 System.out.printf("%s\n", Testobject2.toMilitary());
	 System.out.printf("%s\n", Testobject3.toMilitary());
	 System.out.printf("%s\n", Testobject4.toMilitary()); 
	}

}
