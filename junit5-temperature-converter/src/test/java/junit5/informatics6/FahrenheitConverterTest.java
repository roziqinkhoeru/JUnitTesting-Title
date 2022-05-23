package junit5.informatics6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

class FahrenheitConverterTest {

	FahrenheitConverter f_convert;
	TestInfo testInfo;
	TestReporter testReporter;

	@BeforeAll
	static void beforeAllInit() {
		System.out.println("===== Run Test Program =====\n");
	}
	
	@BeforeEach
	void init(TestInfo testInfo, TestReporter testReporter) {
		this.testInfo = testInfo;
		this.testReporter = testReporter;
		f_convert = new FahrenheitConverter();
		testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tag " + testInfo.getTags());
	}

	@AfterEach
	void cleanUp() {
		System.out.println("Cleaning up...\n");
	}
	
	// nested tester
	@Nested
	@DisplayName("Fahrenheit Test Pocket")
	@Tag("ClassTest")
	class ClassTempTest {
		@Test
		@DisplayName("Fahrenheit to Reamur Testing")
		@Tag("Reamur")
		void reamurTest() {
			assertEquals(37.78, f_convert.fahrenheitToCelcius(100));
		}

		@Test
		@DisplayName("Fahrenheit to Fahrenheit Testing")
		@Tag("Fahrenheit")
		void fahrenheitTest() {
			assertEquals(34, f_convert.fahrenheitToReamur(100));
		}

		@Test
		@DisplayName("Fahrenheit to Kelvin Testing")
		@Tag("Kelvin")
		void kelvinTest() {
			assertEquals(559.67, f_convert.fahrenheitToKelvin(100));
		}
	}
	
	@Test
	@DisplayName("Assert All Fahrenheit Testing")
	void testMultiply() {
		assertAll(
				() -> assertEquals(37.78, f_convert.fahrenheitToCelcius(100)),
				() -> assertEquals(34, f_convert.fahrenheitToReamur(100)),
				() -> assertEquals(559.67, f_convert.fahrenheitToKelvin(100)));
	}
}
