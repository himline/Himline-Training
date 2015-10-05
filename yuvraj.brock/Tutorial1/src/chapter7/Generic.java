package chapter7;

import java.util.ArrayList;
import java.util.List;

public class Generic {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(4);
		myList.add(6);
		Inserter in = new Inserter();
		in.equals(myList); // pass List<Integer> to legacy code
		System.out.println(in);
		System.out.println(myList);
	}
}
