package testing.testingDerivativesAsParentObjects.interfaceAndImplementations;

public class BadStringCounter implements StringCounter {
	@Override
	public int getStringLength(String s) {
		return 0;
	}
}
