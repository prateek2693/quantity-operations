package org.main.length;


public class Meter extends Length{

	private static final double baseConversionFactor = 1d;
	
	public Meter(double metervalue)
	{
		super(metervalue);
	}

		
	@Override
	public Meter convertToBase() {
		return this;
	}


	public static Meter convertToMeter(Length length)
	{
		return (Meter) length.convertToBase();
	}
	
	public Meter addLength(Length length)
	{
		Meter meter1 = this.convertToBase();
		Meter meter2 = (Meter) length.convertToBase();
		
		Meter sum = new Meter(meter1.getQuantityValue() + meter2.getQuantityValue());
		
		return sum;
		
	}
	
}
