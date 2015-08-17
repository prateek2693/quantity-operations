
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
	
	public static Inch convertFromMeterBaseToUnit(Meter meter){
		return new Inch(meter.getMeterValue() / 0.0254);
	}
	
	public static Inch convertToInch(Length length){
		return null;
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
