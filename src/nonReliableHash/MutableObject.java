package nonReliableHash;

public class MutableObject {
	private String stringField;
	private int intField;

	public MutableObject(String stringField, int intField) {
		this.stringField = stringField;
		this.intField = intField;
	}

	public void changeState() {
		intField = (intField * 41 + 123)*13 / 4 % 74;
		stringField += "someMess";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MutableObject that = (MutableObject) o;

		if (intField != that.intField) return false;
		return stringField.equals(that.stringField);
	}

	@Override
	public int hashCode() {
		int result = stringField.hashCode();
		result = 31 * result + intField;
		return result;
	}

	@Override
	public String toString() {
		return "MutableObject{" +
				"stringField='" + stringField + '\'' +
				", intField=" + intField +
				", hashCode=" + hashCode() +
				'}';
	}
}
