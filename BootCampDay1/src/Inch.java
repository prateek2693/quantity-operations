
public class Inch extends Length{
	
	private double inchvalue;
	
	public Inch(double inchvalue)
	{
		this.inchvalue = inchvalue;
	}

	@Override
	public Meter convertToMeterBase() {
		return new Meter(inchvalue * 0.0254);
	}
	
	private static Inch convertFromMeterBaseToUnit(Meter meter){
		return new Inch(meter.getMeterValue() / 0.0254);
	}
	
	public static Inch convertToInch(Length length){
		Meter m = length.convertToMeterBase();
		return Inch.convertFromMeterBaseToUnit(m);
	}
	
	public Inch addLength(Length length)
	{
		Meter meter1 = this.convertToMeterBase();
		Meter meter2 = length.convertToMeterBase();
		
		Meter sum = new Meter(meter1.getMeterValue() + meter2.getMeterValue());
		
		return convertToInch(sum);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(inchvalue);
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
		Inch other = (Inch) obj;
		if (Double.doubleToLongBits(inchvalue) != Double
				.doubleToLongBits(other.inchvalue))
			return false;
		return true;
	}
	
	
}
