package testing.testingDerivativesAsParentObjects.classAndDerivatives;

import de.bechte.junit.runners.context.HierarchicalContextRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(HierarchicalContextRunner.class)
public class LoudStringLengthCounterTest {

	@Test
	public void otherLoudLogicTest() {

	}

	public class AsBasicStringLengthCounterTest extends BasicStringLengthCounterTest {
		@Before
		public void setLoudStringLengthCounterTest() {
		}
	}

}
