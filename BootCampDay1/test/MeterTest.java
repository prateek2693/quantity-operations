import static org.junit.Assert.*;

import org.junit.Test;


public class MeterTest {

	Meter onemeter= new Meter(1);
	
	@Test
	public void testConvertToBase(){
		assertEquals(new Meter(1),onemeter.convertToMeterBase());
	}
	
	@Test
	public void testConvertKilometerToMeter()
	{
		assertEquals(new Meter(1000),Meter.convertToMeter(new Kilometer(1)));
	}
	
	@Test
	public void testConvertRodToMeter()
	{
		assertEquals(new Meter(5.0292), Meter.convertToMeter(new Rod(1)));
	}

}
