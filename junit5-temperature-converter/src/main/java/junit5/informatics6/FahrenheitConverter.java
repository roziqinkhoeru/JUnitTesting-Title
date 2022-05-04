package junit5.informatics6;

public class FahrenheitConverter {

	// fahrenheit to celcius
	public double fahrenheitToCelcius(double f) {
		return (f - 32) * 5 / 9;
	}

	// fahrenheit to reamur
	public double fahrenheitToReamur(double f) {
		return (f - 32) / (9 / 4);
	}

	// fahrenheit to kelvin
	public double fahrenheitToKelvin(double f) {
		return (f + 459.67) / (9 / 5);
	}
}
