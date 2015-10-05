package com.himline.chapter5;

public class classlabeled {
	static boolean isTrue = false;

	public static void main(String[] args) {
		outer:
			for (int i = 0; i < 5; i++)

		{
			while (isTrue) {
				System.out.println("Hello");
				continue outer;
			} // end of inner while loop
			System.out.println("Outer loop."); // Won't print
		} // end of outer for loop
		System.out.println("Good-Bye");
	}
}