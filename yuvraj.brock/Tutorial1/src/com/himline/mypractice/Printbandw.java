package com.himline.mypractice;

public class Printbandw {
	public static void main(String[] args) {
		String[][] checker = new String[9][9];

		for (int i = 1; i < 9; i++) {
			for (int j = 1; j < 9; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 1) {
						checker[i][j] = "black";
					} else {
						checker[i][j] = "white";
					}
				} else {
					if (j % 2 == 1) {
						checker[i][j] = "white";
					} else {
						checker[i][j] = "black";
					}
				}
			}
		}

		String temp = "";
		for (int i = 1; i < 9; i++) {
			for (int j = 1; j < 9; j++) {
				temp = temp + checker[i][j] + "-";
			}

			System.out.println(temp);
			temp = "";
		}
	}
}