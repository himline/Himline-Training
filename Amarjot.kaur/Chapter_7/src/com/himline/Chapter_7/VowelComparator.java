package com.himline.Chapter_7;

import java.util.Comparator;

public  class VowelComparator implements Comparator<String> {
	public int Compare(String x , String y){
		if(getVowelCount(x) < getVowelCount(y)){
			return -1;
		}
		else 
				if(getVowelCount(x) > getVowelCount(y)){
				return 1;
			}
			return 0;
		}
	
	

	private int getVowelCount(String word) {
		int Vowel = 0;
		for (int i = 0; i < word.length(); i++) {
			char chr = word.charAt(i);
			if (chr == 'a' || chr == 'A' || chr == 'e' || chr == 'E'
					|| chr == 'i' || chr == 'I' || chr == 'o' || chr == 'O'
					|| chr == 'u' || chr == 'U')
				Vowel++;
		}
		return Vowel;
	}



	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
