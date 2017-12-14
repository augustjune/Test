package testing.testingDerivativesAsParentObjects.interfaceAndImplementations;

import org.junit.Test;
import testing.testingDerivativesAsParentObjects.StringLengthCounterTest;

public class GoodStringLengthCounterImplTest {

	@Test
	public void otherImplTest() {
	    // Tests other class' logic
	}

	@Test
	public void asStringCounterTest() {
		GoodStringLengthCounterImpl goodStringCounter = new GoodStringLengthCounterImpl();
		StringLengthCounterTest.run(goodStringCounter);
	}

}
