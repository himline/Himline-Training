package chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Arraylistsample {

	public static void main(String[] args) {
		List<String> stuff = new ArrayList<String>(); // #1
		stuff.add("Denver");
		stuff.add("Boulder");
		stuff.add("Vail");
		stuff.add("Aspen");
		stuff.add("Telluride");
		System.out.println("unsorted " + stuff);
		Collections.reverse(stuff);
		System.out.println("sorted " + stuff);

	}
}
