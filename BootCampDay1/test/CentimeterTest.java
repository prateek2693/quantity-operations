import static org.junit.Assert.*;

import org.junit.Test;
import org.main.length.Centimeter;
import org.main.length.Meter;


public class CentimeterTest {
	Meter onemeter = new Meter(1);
	Centimeter centi = new Centimeter(100);

	@Test
	public void testConvertToBase() {
		assertEquals(onemeter,centi.convertToBase());
	}
		
}
