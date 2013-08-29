package machines;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

	public class MapPanel extends JPanel{
	
		public static String ImageMap="";
		public static String ImageAuto=""; 
		Image image;
		Image machine;
		ImageIcon mapIcon;
		ImageIcon auto;
		
		//переписывается стандартный метод добавления картинки
		@Override
		protected void paintComponent(Graphics g) {

					mapIcon= new ImageIcon(getClass().getResource(ImageMap));
					image = mapIcon.getImage();
			
					super.paintComponent(g);
			        g.drawImage(image, 50,0, this);
			    
			        auto=new ImageIcon(getClass().getResource("img/auto1.png"));
			        machine=auto.getImage();
			        
		}
	}	    
	 