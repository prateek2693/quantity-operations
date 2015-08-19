package org.main.volume;

public class Celsius extends Temperature{


	public Celsius(double quantityValue) {
		super(quantityValue);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Celsius convertToBase() {
		return this;
	}
	
	public static Celsius convertToCelsius(Temperature temperature ) {
		return  (Celsius) temperature.convertToBase();
	}

}
