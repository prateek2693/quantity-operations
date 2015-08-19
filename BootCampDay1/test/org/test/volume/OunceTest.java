package org.test.volume;

import static org.junit.Assert.*;

import org.junit.Test;
import org.main.volume.Cup;
import org.main.volume.Ounce;

public class OunceTest {

	@Test
	public void testConvertCupToOunce() {
		assertEquals(new Ounce(8), Ounce.convertToOunce(new Cup(1)));
	}
	
	

}
