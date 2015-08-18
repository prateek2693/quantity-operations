
public class Yard extends Length{

	private double yardvalue;
	
	public Yard(double yardvalue)
	{
		this.yardvalue = yardvalue;
	}

	@Override
	public Meter convertToMeterBase() {
		return new Meter(yardvalue * 0.9144);
	}
	
	public static Yard convertFromBaseMeterToUnit(Meter meter){
		return new Yard(meter.getMeterValue() / 0.9144);
	}
	
	public static Yard convertToYard(Length length){
		Meter m = length.convertToMeterBase();
		return Yard.convertFromBaseMeterToUnit(m);
	}

	public Yard addLength(Length length)
	{
		Meter meter1 = this.convertToMeterBase();
		Meter meter2 = length.convertToMeterBase();
		
		Meter sum = new Meter(meter1.getMeterValue() + meter2.getMeterValue());
		
		return convertToYard(sum);				
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(yardvalue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Yard other = (Yard) obj;
		if (Double.doubleToLongBits(yardvalue) != Double
				.doubleToLongBits(other.yardvalue))
			return false;
		return true;
	}
	
	
	
	
}
