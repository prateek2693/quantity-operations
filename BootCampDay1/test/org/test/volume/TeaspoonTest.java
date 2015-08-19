package org.test.volume;

import static org.junit.Assert.*;

import org.junit.Test;
import org.main.volume.Tablespoon;
import org.main.volume.Teaspoon;
import org.main.volume.Volume;

public class TeaspoonTest {

	@Test
	public void testConvertTablespoonToTeaspoon() {
		Volume teaspoon = new Teaspoon(3);
		Volume tablespoon = new Tablespoon(1);
		assertEquals(teaspoon, Teaspoon.convertToTeaspoon(tablespoon));		
	}

}
