package src.test.java;

import static org.junit.Assert.*;
import src.main.java.*;
import org.junit.Test;

public class fibonacciCounter {

	@Test
	public void testReset() {
		Fibonacci testFibo = new Fibonacci();
		assertEquals(testFibo.fibonacciCounter(9).toString(), "1 2 3 5 8 13 21 34 55");
	}

}
