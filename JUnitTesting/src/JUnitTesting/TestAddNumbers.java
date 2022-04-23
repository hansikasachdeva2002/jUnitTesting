package JUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumbers {

	@Test
	public void test() {
		JUnitFunctions test = new JUnitFunctions();
		int sum = test.addNumbers(10, 20);
		assertEquals(30, sum);
	}

}
