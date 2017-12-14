package testing.testingDerivativesAsParentObjects.interfaceAndImplementations;

public class GoodStringCounter implements StringCounter {
	@Override
	public int getStringLength(String s) {
		return s.length();
	}
}
