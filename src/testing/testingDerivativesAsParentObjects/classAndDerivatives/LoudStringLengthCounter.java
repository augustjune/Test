package testing.testingDerivativesAsParentObjects.classAndDerivatives;

public class LoudStringLengthCounter extends BasicStringLengthCounter{

	public LoudStringLengthCounter(String s1) {
		super(s1);
	}

	public LoudStringLengthCounter(String s1, String s2) {
		super(s1, s2);
	}

	@Override
	public int countStringLength() {
		System.out.printf("I'm getting summary length of words '%s' and '%s', unless it's null ofc :)\n", s1, s2);
		return super.countStringLength();
	}
}
