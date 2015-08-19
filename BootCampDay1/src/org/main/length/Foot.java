package org.main.length;


public class Foot extends Length{
	
	private double footvalue;
	
	public Foot(double footvalue)
	{
		super(footvalue);
	}

	@Override
	public Meter convertToBase(){
		return new Meter(footvalue * 0.3048);
	}
	
	public static Foot convertFromMeterBaseToUnit(Meter meter)
	{
		return new Foot(meter.getQuantityValue() / 0.3048);
	}
	
	public static Foot convertToFoot(Length length)
	{
		Meter m = (Meter) length.convertToBase();
		return Foot.convertFromMeterBaseToUnit(m);
	}

	
	
}
