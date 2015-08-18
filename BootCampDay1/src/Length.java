
public abstract class Length 
{
	public abstract Meter convertToMeterBase();
	
	public static Length addLengths(Length length1, Length length2)
	{
		Meter meter1 = length1.convertToMeterBase();
		Meter meter2 = length2.convertToMeterBase();
		
		Meter sum = new Meter(meter1.getMeterValue() + meter2.getMeterValue());
		
		
		return null;
	}
	
}
