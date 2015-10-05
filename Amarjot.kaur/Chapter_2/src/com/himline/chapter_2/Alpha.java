package com.himline.chapter_2;

public class Alpha {

	static String s = " ";

	protected Alpha() {
		s += "alpha ";
	}
}

class SubAlpha extends Alpha {
	private SubAlpha() {
		s += "sub ";
	}
}



//ctl+sft+f