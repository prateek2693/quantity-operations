
public class Rod extends Length{

	private double rodvalue;
	
	public Rod(double rodvalue)
	{
		this.rodvalue = rodvalue;
	}

	@Override
	public Meter convertToMeterBase() {
		return new Meter(rodvalue * 5.0292);
	}
	
	public static Rod convertFromMeterBaseToUnit(Meter meter)
	{
		return new Rod(meter.getMeterValue() / 5.0292);
	}
	
	public static Rod convertToRod(Length length)
	{
		Meter m = length.convertToMeterBase();
		return Rod.convertFromMeterBaseToUnit(m);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(rodvalue);
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
		Rod other = (Rod) obj;
		if (Double.doubleToLongBits(rodvalue) != Double
				.doubleToLongBits(other.rodvalue))
			return false;
		return true;
	}
	
	
	
	
	
}
