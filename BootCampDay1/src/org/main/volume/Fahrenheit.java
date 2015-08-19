package org.main.volume;

public class Fahrenheit extends Temperature {
	

	private static final double base_value_to_convert_to_celsius = 9/5;
	private static final double base_value_offset_convert_to_celsius = 32;
	
	public Fahrenheit(double quantityValue) {
		super(quantityValue);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Celsius convertToBase() {
		return new Celsius((getQuantityValue()-base_value_offset_convert_to_celsius)* 5d/9d);
	}
	
	public static Fahrenheit convertToFahrenheit(Temperature temperature) {
		return convertFromBase((Celsius)temperature.convertToBase());
	}
	
	private static Fahrenheit convertFromBase(Celsius celsius) {
		return new Fahrenheit((celsius.getQuantityValue()*base_value_to_convert_to_celsius + base_value_offset_convert_to_celsius));
	}
	

}
