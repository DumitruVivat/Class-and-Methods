package myproject;

public class Temperature {
	

	public static void main(String[] args) {
		double a = 30;
		double b = 86.0;
	System.out.println("Convert " + a + " Celsius to Fahrenheit = " + CelsiusToFahrenheit(a));
	System.out.println("Convert "+ b +" Fahrenheit to Celsius = " + FahrenheitToCelsius(b));

	}
	
	static double CelsiusToFahrenheit(double celsius) {
		
		return celsius * 9/5 + 32;
	}
    static double FahrenheitToCelsius(double fahrenheit) {
		
		return (fahrenheit - 32) *5/9;
	}
    

}
