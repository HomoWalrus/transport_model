package machines;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
//import javax.swing.SwingUtilities;
 

public class MainFrame extends JFrame{
    
	public MainFrame() {
			initUI();	   
	    }
	// метод, реализующий само окно, меню, кнопки и т.д.    
	private void initUI(){	
	    	// создаем объекты меню
			JMenuBar menu=new JMenuBar();
			
			JMenu file= new JMenu("File");
			JMenu map= new JMenu("Map");
			JMenu run= new JMenu("Run");
			
			JMenuItem open=new JMenuItem("Open");
			JMenuItem fresh=new JMenuItem("New");
			JMenuItem save=new JMenuItem("Save");
			JMenuItem exit=new JMenuItem("Exit");
			JMenuItem execute=new JMenuItem("Run");
			JMenuItem stop=new JMenuItem("Stop");
			JMenuItem settings=new JMenuItem("Preferences");
			JMenuItem loadMap=new JMenuItem("Load map");
			
			file.add(open);
			file.add(fresh);
			file.add(save);
			file.add(exit);
			
			map.add(loadMap);
			map.add(settings);
			
			run.add(execute);
			run.add(stop);
			
			
			//параметры окна
			setTitle("Transport model");
	    	setSize(900,700);
	    	setLocationRelativeTo(null);
	    	setDefaultCloseOperation(EXIT_ON_CLOSE);     
	    }
	
	    public static void main(String[] args) {
	        
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                MainFrame obj = new MainFrame();
	                obj.setVisible(true);
	            }
	        });
	    }
}