
public class Centimeter extends Length{

	private double centimetervalue;
	
	public Centimeter(double centimetervalue)
	{
		this.centimetervalue = centimetervalue;
	}

	@Override
	public Meter convertToMeterBase() {
		return new Meter(centimetervalue/100);
	}

	public static Centimeter convertFromMeterBaseToUnit(Meter meter) {
		return new Centimeter(meter.getMeterValue()*100);		
	}
	
	public static Centimeter convertToCentimeter(Length length)
	{
		Meter m = length.convertToMeterBase();
		return Centimeter.convertFromMeterBaseToUnit(m);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(centimetervalue);
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
		Centimeter other = (Centimeter) obj;
		if (Double.doubleToLongBits(centimetervalue) != Double
				.doubleToLongBits(other.centimetervalue))
			return false;
		return true;
	}
	
}
