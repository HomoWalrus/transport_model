package machines;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MachinePanel extends JComponent{

	ImageIcon auto=new ImageIcon(getClass().getResource("img/start.png"));
	Image machine=auto.getImage();
	
	
	
	// переписывается стандартный метод, как и в mappanel
	@Override
	protected void paintComponent(Graphics g) {
	   
			super.paintComponent(g);
	        g.drawImage(machine,50,0,this);
	    
		}
}
