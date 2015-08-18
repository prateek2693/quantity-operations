import static org.junit.Assert.*;

import org.junit.Test;


public class CentimeterTest {
	Meter onemeter = new Meter(1);
	Centimeter centi = new Centimeter(100);

	@Test
	public void testConvertToBase() {
		assertEquals(onemeter,centi.convertToMeterBase());
	}
		
}
