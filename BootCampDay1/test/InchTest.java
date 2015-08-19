import static org.junit.Assert.*;

import org.junit.Test;
import org.main.length.Inch;
import org.main.length.Meter;

public class InchTest {

	Meter onemeter = new Meter(1);
	Inch inch = new Inch(1/0.0254); 
	
	@Test
	public void testConvertToBase() {
		assertEquals(onemeter,inch.convertToBase());
	}
	
/*	@Test
	public void testConvertFootToInch(){
		assertEquals(new Inch(12),Inch.convertToInch(new Foot(1)));
	}
	
	@Test
	public void testConvertRodToInch(){
		assertEquals(new Inch(198), Inch.convertToInch(new Rod(1)));
	}
*/
	
	@Test
	public void testAdditionOfLengthToInch()
	{
		assertEquals(new Inch(2),new Inch(1).addLength(new Meter(0.0254)));
	}
	
	@Test
	public void testAdditionOfInchToInch()
	{
		assertEquals(new Inch(2),new Inch(1).addLength(new Inch(1)));
	}
}
