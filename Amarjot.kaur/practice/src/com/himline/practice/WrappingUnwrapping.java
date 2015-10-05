package com.himline.practice;

public class WrappingUnwrapping {

	public static void main(String[] args) {
		byte grade = 5;
		int marks = 53;
		float price = 34.4f;
		double rate = 564.67;

		Byte b1 = new Byte(grade);
		Integer I1 = new Integer(marks);
		Float F1 = new Float(price);
		Double D1 = new Double(rate);

		System.out.println("values of wrapper object :");
		
		System.out.println("grade :" + b1);
		System.out.println("marks :" + I1);
		System.out.println("price :" + F1);
		System.out.println("rate :" + D1);

		byte by = b1.byteValue();
		int in = I1.intValue();
		float ft = F1.floatValue();
		double db = D1.doubleValue();

		System.out.println("values of unwrapper object :");
		System.out.println("grade :" + by);
		System.out.println("marks :" + in);
		System.out.println("price :" + ft);
		System.out.println("rate :" + db);

	}

}
