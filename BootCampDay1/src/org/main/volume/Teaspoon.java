package org.main.volume;

public class Teaspoon extends Volume {

	public Teaspoon(double quantityValue) {
		super(quantityValue);
		// TODO Auto-generated constructor stub
	}

	@Override
	public MetricQuantity convertToBase() {
		// TODO Auto-generated method stub
		return this;
	}

	public static Teaspoon convertToTeaspoon(Volume volume) {
		return (Teaspoon) volume.convertToBase();
	}

}
