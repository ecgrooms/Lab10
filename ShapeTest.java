import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

public class ShapeTest {
	
	@Test
	public void Test(){
		
		Square s1 = new Square( new Point(200, 200), 200, Color.BLUE, true);
		
		Assert.assertEquals(Color.BLUE, s1.getColor());
		Assert.assertEquals(true, s1.isFilled());
		Assert.assertNotEquals(200, s1.location);
	
	}
		

}
