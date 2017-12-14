package testing.testingDerivativesAsParentObjects.interfaceAndImplementations;

import org.junit.Test;
import testing.testingDerivativesAsParentObjects.StringLengthCounterTest;

public class BadStringLengthCounterImplTest {

	@Test
	public void otherImplTest() {
		// Tests other class' logic
	}

	@Test
	// This test should fail as it is an example of bad interface implementation
	// which must be detected by tests
	public void asStringCounterTest() {
	    BadStringLengthCounterImpl badStringCounter = new BadStringLengthCounterImpl();
		StringLengthCounterTest.run(badStringCounter);
	}

}
