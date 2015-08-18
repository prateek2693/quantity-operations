import static org.junit.Assert.*;

import org.junit.Test;


public class LengthTest {

	@Test
	public void testAdditionOfLengths() {
		assertEquals(new Meter(2),Length.addLengths(new Meter(1),new Centimeter(100)));
	}

}
