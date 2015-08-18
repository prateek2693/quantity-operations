import static org.junit.Assert.*;
import org.junit.Test;

public class TestQuantity {

	
	@Test
	public void testConvertToMeter() {
		Length centimeter = new Centimeter(100);
		Length millimeter = new Millimeter(1000);
		Length kilometer = new Kilometer(0.001);
		Length inch = new Inch(1/0.0254);
		Length foot = new Foot((double)1/0.3048);
		Length yard = new Yard(1/0.9144);
		Length mile = new Mile(1/1609.344);
		Length rod = new Rod(1/5.0292);
		
		Meter onemeter = new Meter(1);
		
		System.out.println(Meter.convertToMeter(foot).getMeterValue());
		
		assertEquals(onemeter, Meter.convertToMeter(centimeter));
		assertEquals(onemeter, Meter.convertToMeter(millimeter));
		assertEquals(onemeter, Meter.convertToMeter(kilometer));
		assertEquals(onemeter, Meter.convertToMeter(inch));
//		assertEquals(onemeter, Meter.convertToMeter(foot));
		assertEquals(onemeter, Meter.convertToMeter(yard));
		assertEquals(onemeter, Meter.convertToMeter(mile));
		assertEquals(onemeter, Meter.convertToMeter(rod));
	}
	
	
	public void testConvertToCentimeter(){
		Length millimeter = new Millimeter(1000);
		Length kilometer = new Kilometer(0.001);
		Length inch = new Inch(1/0.0254);
		Length foot = new Foot((double)1/0.3048);
		Length yard = new Yard(1/0.9144);
		Length mile = new Mile(1/1609.344);
		Length rod = new Rod(1/5.0292);
		Length meter = new Meter(1);
		
		Centimeter onemeter = new Centimeter(100);
		assertEquals(onemeter, Centimeter.convertToCentimeter(millimeter));
		assertEquals(onemeter, Centimeter.convertToCentimeter(millimeter));
		assertEquals(onemeter, Centimeter.convertToCentimeter(kilometer));
		assertEquals(onemeter, Centimeter.convertToCentimeter(inch));
		assertEquals(onemeter, Centimeter.convertToCentimeter(foot));
		assertEquals(onemeter, Centimeter.convertToCentimeter(yard));
		assertEquals(onemeter, Centimeter.convertToCentimeter(mile));
		assertEquals(onemeter, Centimeter.convertToCentimeter(rod));
		assertEquals(onemeter, Centimeter.convertToCentimeter(meter));
	}
	

	public void testConvertToFoot(){
		Length millimeter = new Millimeter(1000);
		Length kilometer = new Kilometer(0.001);
		Length inch = new Inch(1/0.0254);
		Length foot = new Foot((double)1/0.3048);
		Length yard = new Yard(1/0.9144);
		Length mile = new Mile(1/1609.344);
		Length rod = new Rod(1/5.0292);
		Length meter = new Meter(1);

	}
}
