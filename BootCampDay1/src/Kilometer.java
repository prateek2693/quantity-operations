
public class Kilometer extends Length{
	
	private double kilometervalue;
	
	public Kilometer(double kilometervalue)
	{
		this.kilometervalue = kilometervalue;
	}

	@Override
	public Meter convertToMeterBase() {
		return new Meter(kilometervalue*1000);
	}
	
	public static Kilometer convertFromBaseMeterToUnit(Meter meter)
	{
		return new Kilometer(meter.getMeterValue()/1000);
	}
	
	public static Kilometer convertToKilometer(Length length)
	{
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(kilometervalue);
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
		Kilometer other = (Kilometer) obj;
		if (Double.doubleToLongBits(kilometervalue) != Double
				.doubleToLongBits(other.kilometervalue))
			return false;
		return true;
	}
	
	
	
	

}
