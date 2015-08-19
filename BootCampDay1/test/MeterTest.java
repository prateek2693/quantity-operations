import static org.junit.Assert.*;

import org.junit.Test;
import org.main.length.Kilometer;
import org.main.length.Meter;
import org.main.length.Rod;


public class MeterTest {

	Meter onemeter= new Meter(1);
	
	@Test
	public void testConvertToBase(){
		assertEquals(new Meter(1),onemeter.convertToBase());
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
