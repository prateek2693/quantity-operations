
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
		return null;
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
