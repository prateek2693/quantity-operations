package org.main.volume;

public class Ounce extends Volume {

	private static final double base_conversion_value = 6;
	public Ounce(double quantityValue) {
		super(quantityValue);
	}

	@Override
	public MetricQuantity convertToBase() {
		return new Teaspoon(base_conversion_value*super.getQuantityValue());
		
	}
	
	private static Ounce convertFromBase(Teaspoon teaspoon)
	{
		return new Ounce(teaspoon.getQuantityValue() / base_conversion_value);
	}
	
	public static Ounce convertToOunce(Volume volume) {
		Teaspoon teaspoon = (Teaspoon) volume.convertToBase();
		return convertFromBase(teaspoon);
		
	}
	
	
}
