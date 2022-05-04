package junit5.informatics6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

class CelciusConverterTest {

	CelciusConverter c_convert;
	TestInfo testInfo;
	TestReporter testReporter;

	@BeforeAll
	static void beforeAllInit() {
		System.out.println("Run Test Program\n");
	}
	
	@BeforeEach
	void init(TestInfo testInfo, TestReporter testReporter) {
		this.testInfo = testInfo;
		this.testReporter = testReporter;
		c_convert = new CelciusConverter();
		testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tag " + testInfo.getTags());
	}

	@AfterEach
	void cleanUp() {
		System.out.println("Cleaning up...\n");
	}
	
	// tester 1
	@Test
	@DisplayName("Reamur Testing")
	@Tag("Reamur")
	void reamurTest() {
		double expected = 8.0;
		double actual = c_convert.celciusToReamur(10);

		assertEquals(expected, actual, () -> "Should return convert " + expected + " but returned " + actual);
	}

}
