package com.himline.chapter1;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 10;
		int[] a = new int[j];
		for (int i = 0; i < j; i++) {
			// System.out.println("i "+ a[i] + " jj "+j);
			a[i] = j - i;
			System.out.println("i  " + i + "  valuexxx  " + a[i]);
			if (i < 5) {
				break;
			}
			System.out.println("i  " + i + "  value  " + a[i]);
		}

	}

}
