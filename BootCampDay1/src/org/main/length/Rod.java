package org.main.length;


public class Rod extends Length{

	
	public Rod(double rodvalue)
	{
		super(rodvalue);
	}

	@Override
	public Meter convertToBase() {
		return new Meter(getQuantityValue() * 5.0292);
	}
	
	public static Rod convertFromMeterBaseToUnit(Meter meter)
	{
		return new Rod(meter.getQuantityValue() / 5.0292);
	}
	
	public static Rod convertToRod(Length length)
	{
		Meter m = (Meter) length.convertToBase();
		return Rod.convertFromMeterBaseToUnit(m);
	}
	
	
	
	
}
