package org.main.length;


public class Centimeter extends Length{

	private static final double baseConversionFactor = 0.01d;
	
	public Centimeter(double centimetervalue)
	{
		super(centimetervalue);
	}

	@Override
	public Meter convertToBase() {
		return new Meter(getQuantityValue() * baseConversionFactor);
	}

	private static Centimeter convertFromMeterBaseToUnit(Meter meter) {
		return new Centimeter(meter.getQuantityValue() / baseConversionFactor);		
	}
	
	public static Centimeter convertToCentimeter(Length length)
	{
		Meter m = (Meter) length.convertToBase();
		return convertFromMeterBaseToUnit(m);
	}
	
	
	
}
