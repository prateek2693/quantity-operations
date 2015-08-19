package org.main.volume;

public class Tablespoon extends Volume {

	private final double base_conversion_value = 3;
	
	public Tablespoon(double quantityValue) {
		super(quantityValue);
		// TODO Auto-generated constructor stub
	}

	@Override
	public MetricQuantity convertToBase() {
		return new Teaspoon(3 * super.getQuantityValue());
	}

}
