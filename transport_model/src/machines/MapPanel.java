package machines;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

	public class MapPanel extends JPanel{
	
		public static String ImageFile="";
		Image image;
		ImageIcon mapIcon;
		
		//переписывается стандартный метод добавления картинки
		@Override
		protected void paintComponent(Graphics g) {

					mapIcon= new ImageIcon(getClass().getResource(ImageFile));
					image = mapIcon.getImage();
			
					super.paintComponent(g);
			        g.drawImage(image, 50,0, this);
			    
				}
	}	    
	 