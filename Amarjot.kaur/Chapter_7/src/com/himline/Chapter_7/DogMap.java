package com.himline.Chapter_7;

public class DogMap {

	public DogMap(String n) {
		name = n;
	}

	public String name;

	public boolean equals(Object o) {
		if ((o instanceof DogMap) && (((DogMap) o).name == name)) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return name.length();
	}

}
