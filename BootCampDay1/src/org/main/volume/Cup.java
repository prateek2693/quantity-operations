package org.main.volume;

public class Cup extends Volume{

	private final double base_conversion_value = 48;
	public Cup(double quantityValue) {
		super(quantityValue);
		// TODO Auto-generated constructor stub
	}

	@Override
	public MetricQuantity convertToBase() {		
		return new Teaspoon(base_conversion_value*super.getQuantityValue());
	}
	

}
