package org.main.length;


public class Yard extends Length{

	
	public Yard(double yardvalue)
	{
		super(yardvalue);
	}

	@Override
	public Meter convertToBase() {
		return new Meter(getQuantityValue() * 0.9144);
	}
	
	public static Yard convertFromBaseMeterToUnit(Meter meter){
		return new Yard(meter.getQuantityValue() / 0.9144);
	}
	
	public static Yard convertToYard(Length length){
		Meter m = (Meter) length.convertToBase();
		return Yard.convertFromBaseMeterToUnit(m);
	}

	public Yard addLength(Length length)
	{
		Meter meter1 = this.convertToBase();
		Meter meter2 = (Meter) length.convertToBase();
		
		Meter sum = new Meter(meter1.getQuantityValue() + meter2.getQuantityValue());
		
		return convertToYard(sum);				
	}
	
	
	
	
}
