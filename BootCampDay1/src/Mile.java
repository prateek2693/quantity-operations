
public class Mile extends Length{
	private double milevalue;
	
	public Mile(double milevalue)
	{
		this.milevalue = milevalue;
	}

	@Override
	public Meter convertToMeterBase() {
		return new Meter(milevalue * 1609.344);
	}
	
	public static Mile convertFromMeterBaseToUnit(Meter meter){
		return new Mile(meter.getMeterValue() / 1609.344);
	}
	
	public static Mile convertToMile(Length length){
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(milevalue);
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
		Mile other = (Mile) obj;
		if (Double.doubleToLongBits(milevalue) != Double
				.doubleToLongBits(other.milevalue))
			return false;
		return true;
	}
	
	
	
}
