package org.main.length;


public class Mile extends Length{

	
	public Mile(double milevalue)
	{
		super(milevalue);
	}

	@Override
	public Meter convertToBase() {
		return new Meter(getQuantityValue() * 1609.344);
	}
	
	public static Mile convertFromMeterBaseToUnit(Meter meter){
		return new Mile(meter.getQuantityValue() / 1609.344);
	}
	
	public static Mile convertToMile(Length length){
		Meter m = (Meter) length.convertToBase();
		return Mile.convertFromMeterBaseToUnit(m);
	}
	
	
}
