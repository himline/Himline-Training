package String;

public class Immutabledemo {

	public static void main(String args[]) {
		String s1 = "Hello";
		String s2 = "Hello";

		String s3 = new String("Hello");
		String s4 = new String("Hello");

		System.out.println("s1 == s2"); // true s1 &s2 value are same
		System.out.println("s3 == s4"); // false

		String s5 = new String("Hello");
		String s6 = new String("Hello");

		System.out.println("s1.equals(s2)"); // true equals() compare the value
												// not location
		System.out.println("s5.equals(s6)"); // false

		s2 = "World";
		System.out.println(s1 == s2); // false

		String s7 = "Hello";
		System.out.println(s1.equals(s7)); // false

		System.out.println(s1.equalsIgnoreCase(s7)); // true  refer the same word ignore case

		System.out.println(s1.length()); // prints 5
	}

}
