package junit5.informatics6;

public class FahrenheitConverter {
	int twoNum = 2;
    double temp = Math.pow(10, twoNum);
    
	// fahrenheit to celcius
	public double fahrenheitToCelcius(double f) {
		double fToC = (f - 32) * 5 / 9; 
		return (double) Math.round(fToC*temp)/temp;
	}

	// fahrenheit to reamur
	public double fahrenheitToReamur(double f) {
		double fToR = (f - 32) / (9 / 4); 
		return (double) Math.round(fToR*temp)/temp;
	}

	// fahrenheit to kelvin
	public double fahrenheitToKelvin(double f) {
		double fToK = (f + 459.67) / (9 / 5);
		return (double) Math.round(fToK*temp)/temp;
	}
}
