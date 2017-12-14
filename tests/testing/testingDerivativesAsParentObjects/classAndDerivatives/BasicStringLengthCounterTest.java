package testing.testingDerivativesAsParentObjects.classAndDerivatives;

import de.bechte.junit.runners.context.HierarchicalContextRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(HierarchicalContextRunner.class)
public class BasicStringLengthCounterTest {
	private BasicStringLengthCounter counter;

	public class OneWordTest {
		private final String word = "WORD";
		private final int wordLength = word.length();

		@Before
		public void setUp() {
			BasicStringLengthCounterTest.this.counter = new BasicStringLengthCounter(word);
		}

		@Test
		public void stringLengthTest() {
			assertEquals(wordLength, counter.countStringLength());
		}
	}

	public class TwoWordsTest {
		private final String[] words = {"One", "Two"};
		private int wordsLength() {
			int l =0;
			for (String s : words)
				l += s.length();
			return l;
		}

		@Before
		public void setUp() {
			counter = new BasicStringLengthCounter(words[0], words[1]);
		}

		@Test
		public void stringLengthTest() {
			assertEquals(wordsLength(), counter.countStringLength());
		}
	}

}
