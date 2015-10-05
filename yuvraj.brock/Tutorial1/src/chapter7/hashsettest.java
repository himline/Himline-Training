package chapter7;

import java.util.HashSet;

public class hashsettest {
	public static void main(String[] args) {

		HashSet<hashsearch> lhs = new HashSet<hashsearch>();
		lhs.add(new hashsearch("Banana", 20));
		lhs.add(new hashsearch("Apple", 40));
		lhs.add(new hashsearch("Orange", 30));
		for (hashsearch pr : lhs) {
			System.out.println(pr);
		}
		hashsearch key = new hashsearch("xyz", 20);
		System.out.println("Does set contains key? " + lhs.contains(key));
	}
}

