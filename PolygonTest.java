import java.awt.Color;

import org.junit.Assert;
import org.junit.Test;


public class PolygonTest {
	
	@Test
	public void Test() {
		
		Polygon p1 = new Polygon(Color.RED, true);
		
		Assert.assertEquals(Color.RED, p1.getColor());
		
	}

}
