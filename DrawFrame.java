import java.awt.Dimension;

import javax.swing.JFrame;

public class DrawFrame extends JFrame {
	
	private DrawPanel drawPanel;
	
	public DrawFrame(String title) {
		
		
	}
	
	public void main(String[] args) {
		
		JFrame frame = new JFrame("Graphics");
		
		frame.setSize(new Dimension(400, 400));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		drawPanel = new DrawPanel();
		frame.add(drawPanel);
		
		frame.setVisible(true);
		
		
	}

}
