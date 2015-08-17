
public class Millimeter extends Length {

	private double millimetervalue;
	
	public Millimeter(double millimetervalue)
	{
		this.millimetervalue = millimetervalue;
	}
	
	@Override
	public Meter convertToMeterBase() {
		return new Meter(millimetervalue/1000);
	}

	public static Millimeter convertFromMeterBaseToUnit(Meter meter) {
		return new Millimeter(meter.getMeterValue()*1000);		
	}
	
	public static Millimeter convertToMillimeter(Length length)
	{
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(millimetervalue);
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
		Millimeter other = (Millimeter) obj;
		if (Double.doubleToLongBits(millimetervalue) != Double
				.doubleToLongBits(other.millimetervalue))
			return false;
		return true;
	}
	
	

	
}
