package org.main.length;


public class Millimeter extends Length {

	
	public Millimeter(double millimetervalue)
	{
		super(millimetervalue);
	}
	
	@Override
	public Meter convertToBase() {
		return new Meter(getQuantityValue()/1000);
	}

	public static Millimeter convertFromMeterBaseToUnit(Meter meter) {
		return new Millimeter(meter.getQuantityValue()*1000);		
	}
	
	public static Millimeter convertToMillimeter(Length length)
	{
		Meter m = (Meter) length.convertToBase();
		return Millimeter.convertFromMeterBaseToUnit(m);
	}

	
	

	
}
