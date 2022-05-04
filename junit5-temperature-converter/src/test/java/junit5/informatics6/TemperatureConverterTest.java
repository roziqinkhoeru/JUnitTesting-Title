package junit5.informatics6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

import org.junit.jupiter.api.Test;

class TemperatureConverterTest {

	TemperatureConverter tempconvert;
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
		tempconvert = new TemperatureConverter();
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
		double actual = tempconvert.celciusToReamur(10);

		assertEquals(expected, actual, () -> "Should return convert " + expected + " but returned " + actual);
	}

	// nested tester
	@Nested
	@DisplayName("Test Pocket")
	@Tag("ClassTemperature")
	class ClassTempTest {
		@Test
		@DisplayName("Reamur Testing")
		@Tag("Reamur")
		void reamurTest() {
			assertEquals(80.0, tempconvert.celciusToReamur(100));
		}

		@Test
		@DisplayName("Fahrenheit Testing")
		@Tag("Fahrenheit")
		void fahrenheitTest() {
			assertEquals(212.0, tempconvert.celciusToFahrenheit(100));
		}

		@Test
		@DisplayName("Kelvin Testing")
		@Tag("Kelvin")
		void kelvinTest() {
			assertEquals(373.15, tempconvert.celciusToKelvin(100));
		}
	}

	@Test
	@DisplayName("Assert All Temperature")
	void testMultiply() {
		assertAll(() -> assertEquals(0.8, tempconvert.celciusToReamur(1)),
				() -> assertEquals(33.8, tempconvert.celciusToFahrenheit(1)),
				() -> assertEquals(274.15, tempconvert.celciusToKelvin(1)));
	}

}
