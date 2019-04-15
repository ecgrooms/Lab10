import java.awt.Color;
import java.awt.Graphics;

public class Polygon extends Shape{
	
	public Polygon(Color color, boolean filled) {
		super(color, filled);
		
	}
	
	public void draw(Graphics graphics) {
		int[] xPoints = new int[location.length];
		int[]yPoints = new int[location.length];
		int nPoint = location.length;
		
		graphics.drawPolygon(xPoints, yPoints, nPoint);
		
	}

}
