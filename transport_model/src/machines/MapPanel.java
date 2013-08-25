package machines;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

	public class MapPanel extends JPanel{
	
		public static String ImageFile="";
		
		//переписывается стандартный метод добавления картинки
			@Override
				protected void paintComponent(Graphics g) {
			    
				ImageIcon imageicon = new ImageIcon(getClass().getResource(ImageFile));
				Image image = imageicon.getImage();
				
					super.paintComponent(g);
			        g.drawImage(image, 0, 0, this);
			    
				}
	}	    
	 