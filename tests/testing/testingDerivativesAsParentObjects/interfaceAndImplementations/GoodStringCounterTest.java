package testing.testingDerivativesAsParentObjects.interfaceAndImplementations;

import org.junit.Test;
import testing.testingDerivativesAsParentObjects.StringCounterTest;

public class GoodStringCounterTest {

	@Test
	public void otherImplTest() {
	    // Tests other class' logic
	}

	@Test
	public void asStringCounterTest() {
		GoodStringCounter goodStringCounter = new GoodStringCounter();
		StringCounterTest.run(goodStringCounter);
	}

}
