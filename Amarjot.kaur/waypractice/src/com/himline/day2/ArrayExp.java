package com.himline.day2;

public class ArrayExp {

	public static void main(String args[]) {
		int x1[] = { 16, 26, 36, 46, 56, 66, 76 }; // total elements at a time
		int x2[] = x1;
		System.out.println("6th element of x2: " + x2[5]);

		// to copy a few elements

		int y1[] = { 15, 25, 35, 45, 55, 65, 75 };
		int y2[] = { 105, 205, 305, 405, 505, 605, 705, 805, 905 };
		System.arraycopy(y2, 1, y1, 2, 2);

		System.out.println("\n\ny2 elements after copying");
		for (int i = 0; i < y1.length; i++) {
			System.out.print(y1[i] + "\t");
		}
	}

}
