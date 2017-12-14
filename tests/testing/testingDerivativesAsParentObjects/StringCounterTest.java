package testing.testingDerivativesAsParentObjects;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import testing.testingDerivativesAsParentObjects.interfaceAndImplementations.StringCounter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringCounterTest {
	private static StringCounter instance;

	public static void run(StringCounter stringCounter) {
		instance = stringCounter;
		assertTrue(JUnitCore.runClasses(StringCounterTest.class).wasSuccessful());
	}

	@Test
	public void stringCountingTest() {
		int length = 10;
		String s = buildNLengthString(length);
		assertEquals(length, instance.getStringLength(s));
	}

	private String buildNLengthString(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<n; i++)
			sb.append("c");
		return sb.toString();
	}
}
