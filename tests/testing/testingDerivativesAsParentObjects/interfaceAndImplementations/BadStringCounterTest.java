package testing.testingDerivativesAsParentObjects.interfaceAndImplementations;

import org.junit.Test;
import testing.testingDerivativesAsParentObjects.StringCounterTest;

public class BadStringCounterTest {

	@Test
	public void otherImplTest() {
		// Tests other class' logic
	}

	@Test
	// This test should fail as it is an example of bad interface implementation
	// which must be detected by tests
	public void asStringCounterTest() {
	    BadStringCounter badStringCounter = new BadStringCounter();
		StringCounterTest.run(badStringCounter);
	}

}
