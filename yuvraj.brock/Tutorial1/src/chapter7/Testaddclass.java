package chapter7;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testaddclass {

	@Test
	public void test() {
		Addclass ac = new Addclass();
		int result= ac.add(100, 50);
		assertEquals(50, result);
	}

}
