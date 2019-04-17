import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;


public class CircleTest {
	
	@Test
	public void Test() {
		
		Circle c1 = new Circle( new Point(200, 200), 200, Color.YELLOW, true);
		
		Assert.assertEquals(true, c1.isFilled());
		
		
	}

}
