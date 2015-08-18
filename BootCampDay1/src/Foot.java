
public class Foot extends Length{
	
	private double footvalue;
	
	public Foot(double footvalue)
	{
		this.footvalue = footvalue;
	}

	@Override
	public Meter convertToMeterBase(){
		return new Meter(footvalue * 0.3048);
	}
	
	public static Foot convertFromMeterBaseToUnit(Meter meter)
	{
		return new Foot(meter.getMeterValue() / 0.3048);
	}
	
	public static Foot convertToFoot(Length length)
	{
		Meter m = length.convertToMeterBase();
		return Foot.convertFromMeterBaseToUnit(m);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(footvalue);
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
		Foot other = (Foot) obj;
		if (Double.doubleToLongBits(footvalue) != Double
				.doubleToLongBits(other.footvalue))
			return false;
		return true;
	}
	
	
	
}
