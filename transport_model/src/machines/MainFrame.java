package machines;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.filechooser.*;
import java.net.*;
import java.awt.Dialog;

public class MainFrame extends JFrame{
    
	
	public MainFrame() {
			initUI();	   
		}
	// метод, реализующий само окно, меню, кнопки
	private void initUI(){	
		final ImageIcon map1l= new ImageIcon(getClass().getResource("img/map1label.png"));
		final ImageIcon map2l= new ImageIcon(getClass().getResource("img/map2label.png"));
		final ImageIcon map3l= new ImageIcon(getClass().getResource("img/map3label.png"));
		
		
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
			
			//загрузка карт
			JMenuItem loadMap=new JMenuItem("Load map");
			loadMap.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e){
				
	            	final JDialog choiceMap=new JDialog(); //создается диалог, задаются параметры окна
	            	//choiceMap.setBounds(100, 100, 450, 300);
	            	choiceMap.setVisible(true);
	            	choiceMap.setSize(500,200);
	            	choiceMap.setTitle("Choose map");
	            	choiceMap.setLocationRelativeTo(null);
	            	choiceMap.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	            		            	
	            	final JPanel maps=new JPanel();//создаем панель под кнопки
			    	choiceMap.add(maps);
			    	maps.setLayout(null);// размещаем, задавая координаты
			    	
			    	final JButton map1=new JButton(map1l);//кнопки с картинками
			    	final JButton map2=new JButton(map2l);
			    	final JButton map3=new JButton(map3l);
			    	
			    	map1.setBorder(BorderFactory.createEmptyBorder());
		      	    map1.setContentAreaFilled(false);
		      	    map1.setBounds(25,50,100,100);
		      	    
		      	    map2.setBorder(BorderFactory.createEmptyBorder());
		      	    map2.setContentAreaFilled(false);
		      	    map2.setBounds(200,50,100,100);
			    	
		      	    map3.setBorder(BorderFactory.createEmptyBorder());
		      	    map3.setContentAreaFilled(false);
		      	    map3.setBounds(375,50,100,100);
			    	
		      	    maps.add(map1);
			    	maps.add(map2);
			    	maps.add(map3);
			    	
			    	map1.addActionListener(new ActionListener(){ // здесь и для других кнопок, при нажатии задается значение переменной в классе mappnel, окно диалога скрывается
			    		@Override
			    		public void actionPerformed(ActionEvent ev){
			    		
			    			MapPanel.ImageFile="img/map1.jpg";
			    			choiceMap.setVisible(false);
			    			setExtendedState(MAXIMIZED_BOTH);
			    			setExtendedState(NORMAL);
			    			maps used = new maps() ;
			    			used.mapinfo(1);
			    		}

			    	});
			    	
			    	map2.addActionListener(new ActionListener(){
			    		@Override
			    		public void actionPerformed(ActionEvent ev){
			    			MapPanel.ImageFile="img/map2.jpg";
			    			choiceMap.setVisible(false);
			    			setExtendedState(MAXIMIZED_BOTH);
			    			setExtendedState(NORMAL);
			    			maps used = new maps() ;
			    			used.mapinfo(2);
			    		}

			    	});
			    	
			    	map3.addActionListener(new ActionListener(){
			    		@Override
			    		public void actionPerformed(ActionEvent ev){
			    			MapPanel.ImageFile="img/map3.jpg";
			    			choiceMap.setVisible(false);
			    			setExtendedState(MAXIMIZED_BOTH);
			    			setExtendedState(NORMAL);
			    			maps used = new maps() ;
			    			used.mapinfo(3);
			    		}

			    	});
	            }
	        });
			
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
            final MapPanel panel=new MapPanel();
      		add(panel);
      		panel.setLayout(null);
      		
      		
      	    /*panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
      	    panel.add(Box.createRigidArea(new Dimension(1000, 0)));
      	    panel.add(Box.createRigidArea(new Dimension(5, 0)));*/
      	    
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
                  
            	  MachinePanel machines=new MachinePanel();
                  panel.add(machines);
                  machines.setLayout(null);
                  
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
				
			SwingUtilities.invokeLater(new Runnable(){
				@Override
				public void run(){
					
					MainFrame frame=new MainFrame();
					frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
				}
			});
			
		
			}
}
