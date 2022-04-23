package JUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddStrings {

	@Test
	public void test() {
		JUnitFunctions test = new JUnitFunctions();
		String res = test.addStrings("Hansika", "Sachdeva");
		assertEquals("HansikaSachdeva", res);
	}

}
