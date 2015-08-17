
public class Meter extends Length{

	private double metervalue;
	
	public Meter(double metervalue)
	{
		this.metervalue = metervalue;
	}
	
	public double getMeterValue()
	{
		return metervalue;
	}
		
	@Override
	public Meter convertToMeterBase() {
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(metervalue);
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
		Meter other = (Meter) obj;
		if (Double.doubleToLongBits(metervalue) != Double
				.doubleToLongBits(other.metervalue))
			return false;
		return true;
	}

	public static Meter convertToMeter(Length length)
	{
		return length.convertToMeterBase();
	}

	public static Meter convertFromMeterBaseToUnit(Meter meter) {
		return meter;
	}
}
