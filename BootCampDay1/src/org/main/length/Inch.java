package org.main.length;


public class Inch extends Length{
	
	private double inchvalue;
	
	public Inch(double inchvalue)
	{
		super(inchvalue);
	}

	@Override
	public Meter convertToBase() {
		return new Meter(inchvalue * 0.0254);
	}
	
	private static Inch convertFromMeterBaseToUnit(Meter meter){
		return new Inch(meter.getQuantityValue() / 0.0254);
	}
	
	public static Inch convertToInch(Length length){
		Meter m = (Meter) length.convertToBase();
		return Inch.convertFromMeterBaseToUnit(m);
	}
	
	public Inch addLength(Length length)
	{
		Meter meter1 = this.convertToBase();
		Meter meter2 = (Meter) length.convertToBase();
		
		Meter sum = new Meter(meter1.getQuantityValue() + meter2.getQuantityValue());
		
		return convertToInch(sum);
	}

	
	
	
}
