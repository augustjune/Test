package testing.testingDerivativesAsParentObjects.classAndDerivatives;

import de.bechte.junit.runners.context.HierarchicalContextRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(HierarchicalContextRunner.class)
public class BadStringLengthCounterTest {

	@Test
	public void someOtherLogicTest() {

	}

	public class AsBasicStringLengthCounterTest extends BasicStringLengthCounterTest {

	}

}
