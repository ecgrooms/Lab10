import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	private ArrayList<Shape> shapeList = new ArrayList<Shape>();
	
	public void addShape(Shape shape) {
		
		shapeList.add(shape);
		
	}
	
	protected void PaintComponent(Graphics graphics) {
				
		graphics.setColor(Color.BLUE);
		graphics.drawRect(50, 40, 200, 100);
		graphics.setColor(Color.GRAY);
		graphics.fillOval(30, 30, 50, 60);
		graphics.setColor(Color.YELLOW);
		graphics.drawRect(50, 50, 50, 50);
		graphics.fillRect(50, 50, 50, 50);
		graphics.drawOval(100, 100, 100, 100);
		graphics.fillOval(100, 100, 100, 100);
		
	}

}
