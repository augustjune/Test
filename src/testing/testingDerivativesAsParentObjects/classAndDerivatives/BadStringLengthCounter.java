package testing.testingDerivativesAsParentObjects.classAndDerivatives;

public class BadStringLengthCounter extends BasicStringLengthCounter {
	public BadStringLengthCounter(String s1) {
		super(s1);
	}

	public BadStringLengthCounter(String s1, String s2) {
		super(s1, s2);
	}

	@Override
	public int countStringLength() {
		return 0;
	}
}
