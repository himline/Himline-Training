package com.himline.Chapter_7;

import java.util.HashSet;

public class HashSetRetain {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		hset.add("apple");
		hset.add("mango");
		hset.add("grapes");
		hset.add("orange");
		System.out.println(hset);
		HashSet<String> hs = new HashSet<String>();
		hs.add("mango");
		hs.add("grapes");
		hset.retainAll(hs);
		System.out.println("Hashset content: ");
		System.out.println(hset);
	}

}
