package chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class listsample {

	public static void main(String[] args) {
		List<String> test = new ArrayList<String>();
		String s = "hi";
		test.add("string");
		test.add(s);
		test.add(s + s);
		
		System.out.println(test.size());
		System.out.println(test.contains(42));
		System.out.println(test.contains("hihi"));
		
		test.remove("hi");
		
		System.out.println(test.size());

	}

}
