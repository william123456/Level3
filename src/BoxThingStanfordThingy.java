import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;

public class BoxThingStanfordThingy {
	

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		BufferedImage image =new BufferedImage(getWindowWidth(100, 100, 100, 100), getWindowWidth(100, 100, 100, 100), BufferedImage.TYPE_INT_ARGB);
		Graphics2D boxGraphic = image.createGraphics();
		
		boxGraphic.setPaint(Color.BLACK);
		
		//boxGraphic = fillBoxes(boxGraphic, 100, 100, 10);
		ImageIcon icon = new ImageIcon(image);
		JLabel boxLabel = new JLabel(icon);
		frame.setContentPane(boxLabel);
		frame.pack();
		frame.requestFocusInWindow();
		frame.setVisible(true);
	}

	public static int getWindowWidth(int border, int boxSize, int sides, int boxSpacing) {
		int size = 8;
		int boxes = 9;
		int space = 10;
		return 	2 * border + (size * boxes) + (space *(boxes - 1));
	
		 
	}

//	public void UI(){
//	






	
	
	
}

