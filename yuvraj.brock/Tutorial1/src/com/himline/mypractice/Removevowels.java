package com.himline.mypractice;

public class Removevowels {
	
	public static void main(String[] args) {

		String[] vowel = new String[5];
		vowel[0] = "a";
		vowel[1] = "i";
		vowel[2] = "e";
		vowel[3] = "o";
		vowel[4] = "u";

		String[] instruments = new String[5];
		instruments[0] = "Guitar";
		instruments[1] = "piano";
		instruments[2] = "shehnai";
		instruments[3] = "drum";
		instruments[4] = "flute";

		for (int i = 0; i < instruments.length; i++) {
			String instrument = instruments[i];
			for (int j = 0; j < vowel.length; j++) {
              instrument = instrument.replace(vowel[j] , "");
			}
			System.out.println(instrument);

		}

	}
}
