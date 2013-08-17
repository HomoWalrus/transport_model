package machines;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

	public class MapPanel extends JPanel {
	    BufferedImage map;
	 
	    public MapPanel(BufferedImage map) {
	        this.map = map;
	    }
	 
	    //переписывается стандартный метод добавления картинки
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        g.drawImage(map, 0, 0, this);
	    }
	}	    
	 