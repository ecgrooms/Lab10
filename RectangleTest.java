import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;


public class RectangleTest {
	
	@Test
	public void Test() {
		
		Rectangle r1 = new Rectangle( new Point(200, 300), 400, 500, Color.GREEN, true);
		
		Assert.assertEquals(Color.GREEN, r1.getColor());
	}

}
