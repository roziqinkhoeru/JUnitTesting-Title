package junit5.informatics6;

public class CelciusConverter {
	int twoNum = 2;
    double temp = Math.pow(10, twoNum);
	
	// celcius to reamur
	public double celciusToReamur(double c) {
		double cToR = 4 * c / 5;
		return (double) Math.round(cToR*temp)/temp;
	}

	// celcius to fahrenheit
	public double celciusToFahrenheit(double c) {
		double cToF = (9 * c / 5) + 32;
		return (double) Math.round(cToF*temp)/temp;
	}

	// celcius to kelvin
	public double celciusToKelvin(double c) {
		double cToK = c + 273.15;
		return (double) Math.round(cToK*temp)/temp;
	}
}
