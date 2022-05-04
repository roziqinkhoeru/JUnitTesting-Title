package junit5.informatics6;

public class CelciusConverter {
	
	// celcius to reamur
	public double celciusToReamur(double c) {
		return 4 * c / 5;
	}

	// celcius to fahrenheit
	public double celciusToFahrenheit(double c) {
		return (9 * c / 5) + 32;
	}

	// celcius to kelvin
	public double celciusToKelvin(double c) {
		return c + 273.15;
	}
}
