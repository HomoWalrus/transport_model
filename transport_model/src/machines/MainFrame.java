package machines;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame{
    
	public MainFrame() {
			initUI();	   
		}
	// метод, реализующий само окно, меню, кнопки
	private void initUI(){	
	    	// создаем объекты меню
			JMenuBar menu=new JMenuBar();
			setJMenuBar(menu);
			
			JMenu file= new JMenu("File");
			JMenu map= new JMenu("Map");
			JMenu run= new JMenu("Run");
			
			menu.add(file);
			menu.add(map);
			menu.add(run);
			
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
			
			//отображение в консоли того, что был клик на пункт меню
			ActionListener printListener = new ActionListener(  ) {
                public void actionPerformed(ActionEvent event) {
                    System.out.println("Menu item [" + event.getActionCommand(  ) +
                                       "] was pressed.");
                }
            };
            
            open.addActionListener(printListener);
            fresh.addActionListener(printListener);
            save.addActionListener(printListener);
            exit.addActionListener(printListener);
            execute.addActionListener(printListener);
            stop.addActionListener(printListener);
            settings.addActionListener(printListener);
            loadMap.addActionListener(printListener);
        
            //кнопки, создаем панель, добавляем в jframe
            JPanel panel=new JPanel();
      		add(panel);

      		// устанавливаем свободное размещение кнопок
      	    panel.setLayout(null);

      	    // грузим картинки
      	    ImageIcon startIcon= new ImageIcon("img/start.jpg");
      	    ImageIcon stopIcon= new ImageIcon("img/stop.jpg");
      	    
      	    //кнопки
      	    JButton start=new JButton("start",startIcon);
      	    JButton pause=new JButton("stop",stopIcon);
      	    
      	    panel.add(start);
      	    panel.add(pause);
      	    
      	    // удаляем границу, устанавливаем положение на экране
      	    //start.setBorder(BorderFactory.createEmptyBorder());
      	    //start.setContentAreaFilled(false);
      	    start.setBounds(700,550,80,80);
      	    
      	    //pause.setBorder(BorderFactory.createEmptyBorder());
      	    //pause.setContentAreaFilled(false);
      	    pause.setBounds(800,550,80,80);
        
		}

		public static void main(String[] args) {
	    	
	    	MainFrame frame=new MainFrame();
	    	
	    	//параметры окна
	    	frame.setTitle("Transport model");
			frame.setSize(900,700);
	    	frame.setLocationRelativeTo(null);
	    	frame.setDefaultCloseOperation(EXIT_ON_CLOSE); 
	    	frame.setVisible(true);
		}
}