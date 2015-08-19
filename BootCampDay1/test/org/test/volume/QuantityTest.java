package org.test.volume;

import static org.junit.Assert.*;

import org.junit.Test;
import org.main.length.Centimeter;
import org.main.length.Length;
import org.main.volume.Celsius;
import org.main.volume.Fahrenheit;
import org.main.volume.MetricQuantity;
import org.main.volume.NonMetricQuantity;
import org.main.volume.Tablespoon;
import org.main.volume.Teaspoon;
import org.main.volume.Temperature;
import org.main.volume.Volume;



public class QuantityTest {

	@Test
	public void testEqualForVolume() {
		Volume teaspoon = new Teaspoon(3);
		Volume tablespoon = new Tablespoon(1);
		assertEquals(true, teaspoon.equals(tablespoon));
	}
	
	@Test
	public void testInequalityForVolume() {
		Volume teaspoon = new Teaspoon(4);
		Volume tablespoon = new Tablespoon(1);
		assertEquals(false, teaspoon.equals(tablespoon));
	}
	
	@Test
	public void testInequalityOfLengthAndVolume() {
		MetricQuantity teaspoon = new Teaspoon(1);
		MetricQuantity meter = new Centimeter(10);
		assertEquals(false, teaspoon.equals(meter));
	}

	@Test
	public void testNonMetricQuantityConversions() {
		NonMetricQuantity celsius = new Celsius(100);
		NonMetricQuantity fahr = new Fahrenheit(212);
		assertEquals(true, celsius.equals(fahr));
		
	}
}
