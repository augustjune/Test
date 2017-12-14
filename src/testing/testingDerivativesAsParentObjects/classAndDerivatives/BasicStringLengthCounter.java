package testing.testingDerivativesAsParentObjects.classAndDerivatives;

public class BasicStringLengthCounter {

	protected String s1;
	protected String s2;

	public BasicStringLengthCounter(String s1) {
		this.s1 = s1;
	}

	public BasicStringLengthCounter(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	public int countStringLength() {
		int l = s1.length();
		if (s2 != null)
			l += s2.length();
		return l;
	}
}
