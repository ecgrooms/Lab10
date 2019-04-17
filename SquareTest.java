import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
	
	@Test
	public void Test(){
		
		Square s1 = new Square( new Point(200, 200), 200, Color.BLUE, true);
		
		Assert.assertEquals(Color.BLUE, s1.getColor());

		
	}

}
