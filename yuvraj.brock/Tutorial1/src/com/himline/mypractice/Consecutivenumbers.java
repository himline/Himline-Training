package com.himline.mypractice;

public class Consecutivenumbers {

	public static void main(String[] args) {

		String num = "1-2-3-4-5";
		String[] str = num.split("-");
		int counter = 0;

		for (int i = 0; i < str.length - 1; i++) {
			Integer int1 = Integer.parseInt(str[i]);
			Integer int2 = Integer.parseInt(str[i + 1]);

			// System.out.println(int1);
			if (int1 > int2) {
				if (int1 - int2 == 1) {
					counter++;
				}
			} else {
				if (int2 - int1 == 1) {
					counter++;
				}
			}
		}

		if (counter == 4) {
			System.out.println("Consecutive");
		}
		if (counter != 4) {
			System.out.println("wrong");
		}
	}
}