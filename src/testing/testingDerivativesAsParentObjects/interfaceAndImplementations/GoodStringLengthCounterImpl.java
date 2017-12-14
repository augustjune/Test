package testing.testingDerivativesAsParentObjects.interfaceAndImplementations;

public class GoodStringLengthCounterImpl implements StringLengthCounter {
	@Override
	public int getStringLength(String s) {
		return s.length();
	}
}
