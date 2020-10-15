package yaksha;

import static org.mockito.Mockito.mock;
import static yaksha.TestUtils.businessTestFile;
import static yaksha.TestUtils.currentTest;
import static yaksha.TestUtils.yakshaAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MainClassTest {

	@Test
	public void testExceptionConditon() throws Exception {
		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.exceptionTestFile);
	}

	@Test
	public void testBoundaryCondition() throws Exception {
		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.boundaryTestFile);
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testFindPattern() throws Exception {
		// Test will pass
		String text = "abcdefghijklmnopqrstuvwxyz";
		String pattern = "qrstuv";
		String receivedResultString = null;
		String expectedResultString = "Pattern found at position : 16";
		int expectedResult = 16;
		BoyerMoore boyerMoore = new BoyerMoore(text, pattern);
		BoyerMooreBO test = mock(BoyerMooreBO.class);
		Mockito.when(test.findPattern(boyerMoore)).thenReturn(expectedResult);
		int pos = test.findPattern(boyerMoore);
		if (pos == -1) {
			receivedResultString = "No Match";
		} else {
			receivedResultString = "Pattern found at position : " + pos;
		}
		yakshaAssert(currentTest(), (expectedResultString.equals(receivedResultString) ? "true" : "false"),
				businessTestFile);
	}
}
