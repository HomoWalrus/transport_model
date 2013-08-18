package machines;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.net.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

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
			// при нажатии на open создается file chooser
			open.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					JFrame frame=new JFrame();
					JFileChooser fc=new JFileChooser();
					fc.setMultiSelectionEnabled(true);
			        fc.setCurrentDirectory(new File("C:\\tmp"));
			        fc.showDialog(frame,"Choose");
				}
			});
			
			JMenuItem fresh=new JMenuItem("New");
			JMenuItem save=new JMenuItem("Save");
			
			JMenuItem exit=new JMenuItem("Exit");
			exit.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	                System.exit(0);
	            }
	        });
			
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
            MapPanel panel=new MapPanel();
      		add(panel);
      		
      	    // грузим картинки
      	    final ImageIcon startIcon= new ImageIcon(getClass().getResource("img/start.jpg"));
      	    final ImageIcon stopIcon= new ImageIcon(getClass().getResource("img/stop.jpeg"));
      	    final ImageIcon pushStopIcon= new ImageIcon(getClass().getResource("img/stoppush.jpg"));
      	    final ImageIcon pushStartIcon= new ImageIcon(getClass().getResource("img/startpush.jpg"));
      	    	
      	    //кнопки
      	    final JButton start=new JButton(startIcon);
      	    final JButton pause=new JButton(stopIcon);
      	   
      	    panel.add(start);
      	    panel.add(pause);
      	         	  
      	    start.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  start.setIcon(start.getIcon()==startIcon? pushStartIcon:startIcon);
                  if(pause.getIcon()==pushStopIcon)
                  {
                	  pause.setIcon(stopIcon);
                  }
              }
          });
      	  
      	  pause.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  pause.setIcon(pause.getIcon()==stopIcon? pushStopIcon:stopIcon);
                  if(start.getIcon()==pushStartIcon)
                  {
                	  start.setIcon(startIcon);
                  }
              }
          });
      	    // удаляем границу, устанавливаем положение на экране
      	    start.setBorder(BorderFactory.createEmptyBorder());
      	    start.setContentAreaFilled(false);
      	    start.setBounds(1000,550,120,120);
      	    
      	    pause.setBorder(BorderFactory.createEmptyBorder());
      	    pause.setContentAreaFilled(false);
      	    pause.setBounds(1150,550,120,120);
        
      	    // подгоняю размер окна под размер экрана.
      	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	         setBounds(0,0,screenSize.width, screenSize.height);
		
	       //параметры окна
		    	setTitle("Transport model");
				setLocationRelativeTo(null);
		    	setDefaultCloseOperation(EXIT_ON_CLOSE); 
		    	setVisible(true);
		  
		    
		}
      
		public static void main(String[] args) throws IOException{
				
			MainFrame frame=new MainFrame();
		
			}
}
