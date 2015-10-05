package com.himline.Chapter_7;

public class Moof {
	private int Moofvalue;

	Moof(int val) {
		Moofvalue = val;
	}

	public int getMoofvalue() {
		return Moofvalue;
	}

	public boolean equal(Object o) {
		if ((o instanceof Moof) && (((Moof) o).getMoofvalue() == this.Moofvalue)) {
			return true;
		} 
		else {
			return false;
		}
	}

}
